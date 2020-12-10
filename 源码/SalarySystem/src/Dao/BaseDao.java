package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.math.BigDecimal;
import Dao.BaseDao.PackResult;
import modelItem.User;
import modelItem.Workload;

//数据库操作类
public class BaseDao {
	//数据库连接类
	private static Connection con;
	//预备语句类
	private static PreparedStatement pstm;
	
	public interface PackResult<T> {
		// 将ResultSet回调给子类，让子类来处理ResultSet中的数据
        T onResultReturn(ResultSet rs) throws Exception; 
	}
	//查询单个用户的属性
	public static Vector select(String sql,List<String> list) throws SQLException {
		Vector<String> vector = new Vector<>();
		con = new DbConnector().getConnection();//创建数据库连接
		pstm = con.prepareStatement(sql);
		for(int i = 0;i<list.size();i++) {
			pstm.setString(i+1, list.get(i));
		}
		//获取结果集
		ResultSet resultSet = pstm.executeQuery();
		//ResultSetMetaData用于获取resultset的列的属性和属性信息
		ResultSetMetaData rmd = resultSet.getMetaData();
		//获取列数
		int col = rmd.getColumnCount();
		while(resultSet.next()) {
			for(int i = 1;i<=col;i++) {
				vector.add(resultSet.getString(i));
			}
		}
		resultSet.close();
		pstm.close();
		con.close();
		return vector;
	}
	
	//多对象查询
	public static Vector<Vector<String>> selectAll(String sql,List<String> list) throws SQLException{
		Vector<Vector<String>> vectors = new Vector<>();
		con = new DbConnector().getConnection();
		pstm = con.prepareStatement(sql);
		for(int i = 0;i<list.size();i++) {
			pstm.setString(i+1,list.get(i));
		}
		//获取查询结果
		ResultSet resultSet = pstm.executeQuery();
		ResultSetMetaData rmd = resultSet.getMetaData();
		int col = rmd.getColumnCount();
		while(resultSet.next()) {
			Vector<String> vector = new Vector<>();
			for(int i = 1;i<=col;i++) {
				vector.add(resultSet.getString(i));
			}
			vectors.add(vector);
		}
		resultSet.close();
		pstm.close();
		con.close();
		return vectors;
	}
	
	//插入数据操作，参数：要传递的sql语句和要插入数据的list
	public static int insert(String sql,List<String> list) throws SQLException {
		con = new DbConnector().getConnection();
		pstm = con.prepareStatement(sql);
		//配对
		for(int i =0;i<list.size();i++) {
			pstm.setString(i+1, list.get(i));
		}
		int insertCount = 0;
		//executeupdate返回的是受影响的行数
		insertCount = pstm.executeUpdate();
		//关闭连接操作
		pstm.close();
		con.close();
		//如果返回的行数为0，则说明没有插入成功
		return insertCount;
	}
	
	//更新数据
	public static int update(String sql,List<String> list) throws SQLException {
		int updateCount = 0;
		con = new DbConnector().getConnection();
		pstm = con.prepareStatement(sql);
		for(int i=0;i<list.size();i++) {
			pstm.setString(i+1,list.get(i));
		}
		updateCount = pstm.executeUpdate();
		pstm.close();
		con.close();
		return updateCount;
	}
	
	private User setUser(Vector userAttributes) {
		return null;
	}
	
	public static int insertOrUpdateOrDelete(String sql, Object... args) throws SQLException {
		con = null;
		pstm = null;
		int count = 0;
		try {
			con = DbConnector.getConnection();
			pstm = con.prepareStatement(sql);
			
			// 将参数设置到sql语句的占位符中
			setValue(pstm, args);
			System.out.println(pstm);
			
			// 受影响的行数
			count = pstm.executeUpdate();
			return count;
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			con.close();
			pstm.close();
		}
	}
	
	public static <T> T select(String sql, PackResult<T> pack, Object... args) throws SQLException {	
		con = null;
		pstm = null;
		ResultSet resultSet = null;
		T result = null;
		try {
			con = DbConnector.getConnection();
			pstm = con.prepareStatement(sql);
			
			// 将参数设置到sql语句的占位符中
			setValue(pstm, args);
//			System.out.println(pstm);
			
			resultSet = pstm.executeQuery();
			// 由于不同的表对应不同的实体类，在基类中无法实现将resultSet封装成对应的实体类返回
			// 故只能通过接口中的回调函数交给子类去实现
			result = pack.onResultReturn(resultSet);	
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			resultSet.close();
			pstm.close();
			con.close();
		}		
	}
	
	
	private static void setValue(PreparedStatement pstmt, Object... args) throws SQLException {
		for (int i = 0; i < args.length; i++) {	
			if (args[i] instanceof String) { // 主要
				pstm.setString(i + 1, (String) args[i]);
			} else  if (args[i] instanceof Integer) { // 主要
				pstm.setInt(i + 1, (int) args[i]);
			} else if (args[i] instanceof Double) {  // 主要
				pstm.setDouble(i + 1, (int) args[i]);
			} else if (args[i] instanceof Float) {
				pstm.setFloat(i + 1, (int) args[i]);
			} else if (args[i] instanceof BigDecimal) { // 主要
				pstm.setBigDecimal(i + 1, (BigDecimal) args[i]);
			} else if (args[i] instanceof Boolean) {
				pstm.setBoolean(i + 1, (boolean) args[i]);
			} else if (args[i] == null) {
				pstm.setObject(i+1, null);
			}
		}
	}

	
	
}
