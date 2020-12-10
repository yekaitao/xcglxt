package Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//将从数据库查询的工资信息转化为二维数组
public class DataDao {

	private String[][] t_data = null;

	public String[][] get_t_datas(String sql){
		
		List<String> list = new ArrayList<>();//参数列表，设置为空
		try {
			Vector<Vector<String>> vectors = new BaseDao().selectAll(sql, list);//获取查找结果
			t_data = new String[vectors.size()][6];//初始化二维字符串数组
			int j = 0;
			for(Vector<String> v:vectors) {	//把查找结果填充进数组
				for(int i =0;i<v.size();i++) {
					t_data[j][i] = v.get(i);
				}
				j++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//返回结果
		return t_data;
	}
	public DataDao()
	{
	}
}
