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

//���ݿ������
public class BaseDao {
	//���ݿ�������
	private static Connection con;
	//Ԥ�������
	private static PreparedStatement pstm;
	
	public interface PackResult<T> {
		// ��ResultSet�ص������࣬������������ResultSet�е�����
        T onResultReturn(ResultSet rs) throws Exception; 
	}
	//��ѯ�����û�������
	public static Vector select(String sql,List<String> list) throws SQLException {
		Vector<String> vector = new Vector<>();
		con = new DbConnector().getConnection();//�������ݿ�����
		pstm = con.prepareStatement(sql);
		for(int i = 0;i<list.size();i++) {
			pstm.setString(i+1, list.get(i));
		}
		//��ȡ�����
		ResultSet resultSet = pstm.executeQuery();
		//ResultSetMetaData���ڻ�ȡresultset���е����Ժ�������Ϣ
		ResultSetMetaData rmd = resultSet.getMetaData();
		//��ȡ����
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
	
	//������ѯ
	public static Vector<Vector<String>> selectAll(String sql,List<String> list) throws SQLException{
		Vector<Vector<String>> vectors = new Vector<>();
		con = new DbConnector().getConnection();
		pstm = con.prepareStatement(sql);
		for(int i = 0;i<list.size();i++) {
			pstm.setString(i+1,list.get(i));
		}
		//��ȡ��ѯ���
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
	
	//�������ݲ�����������Ҫ���ݵ�sql����Ҫ�������ݵ�list
	public static int insert(String sql,List<String> list) throws SQLException {
		con = new DbConnector().getConnection();
		pstm = con.prepareStatement(sql);
		//���
		for(int i =0;i<list.size();i++) {
			pstm.setString(i+1, list.get(i));
		}
		int insertCount = 0;
		//executeupdate���ص�����Ӱ�������
		insertCount = pstm.executeUpdate();
		//�ر����Ӳ���
		pstm.close();
		con.close();
		//������ص�����Ϊ0����˵��û�в���ɹ�
		return insertCount;
	}
	
	//��������
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
			
			// ���������õ�sql����ռλ����
			setValue(pstm, args);
			System.out.println(pstm);
			
			// ��Ӱ�������
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
			
			// ���������õ�sql����ռλ����
			setValue(pstm, args);
//			System.out.println(pstm);
			
			resultSet = pstm.executeQuery();
			// ���ڲ�ͬ�ı��Ӧ��ͬ��ʵ���࣬�ڻ������޷�ʵ�ֽ�resultSet��װ�ɶ�Ӧ��ʵ���෵��
			// ��ֻ��ͨ���ӿ��еĻص�������������ȥʵ��
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
			if (args[i] instanceof String) { // ��Ҫ
				pstm.setString(i + 1, (String) args[i]);
			} else  if (args[i] instanceof Integer) { // ��Ҫ
				pstm.setInt(i + 1, (int) args[i]);
			} else if (args[i] instanceof Double) {  // ��Ҫ
				pstm.setDouble(i + 1, (int) args[i]);
			} else if (args[i] instanceof Float) {
				pstm.setFloat(i + 1, (int) args[i]);
			} else if (args[i] instanceof BigDecimal) { // ��Ҫ
				pstm.setBigDecimal(i + 1, (BigDecimal) args[i]);
			} else if (args[i] instanceof Boolean) {
				pstm.setBoolean(i + 1, (boolean) args[i]);
			} else if (args[i] == null) {
				pstm.setObject(i+1, null);
			}
		}
	}

	
	
}
