package Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//�������ݿ��ѯ�Ĺ�����Ϣת��Ϊ��ά����
public class DataDao {

	private String[][] t_data = null;

	public String[][] get_t_datas(String sql){
		
		List<String> list = new ArrayList<>();//�����б�����Ϊ��
		try {
			Vector<Vector<String>> vectors = new BaseDao().selectAll(sql, list);//��ȡ���ҽ��
			t_data = new String[vectors.size()][6];//��ʼ����ά�ַ�������
			int j = 0;
			for(Vector<String> v:vectors) {	//�Ѳ��ҽ����������
				for(int i =0;i<v.size();i++) {
					t_data[j][i] = v.get(i);
				}
				j++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//���ؽ��
		return t_data;
	}
	public DataDao()
	{
	}
}
