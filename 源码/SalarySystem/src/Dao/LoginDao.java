package Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import modelItem.User;

//����û���¼�������ز鵽���Ľ����Ӧ��user
public class LoginDao {
	public User checkUser(String userName,String userPsw) {
		User user = null;
		List<String> list = new ArrayList<>();
		list.add(userName);
		list.add(userPsw);
		String sql = "select * from user where userName=? and psw=?";
		Vector<String> v = null;
		try {
			//���ز�ѯ���
			v = BaseDao.select(sql, list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�����ѯ�����Ϊ�վͿ���תΪuser
		//����BaseDao���select�������Ѿ�������vector����Ҫ�ж�vector���Ƿ�������
		if(v.size()>1) {
			//��vectorתΪuser
			user = new UserDao().creatUser(v);
		}
		return user;
	}
	
}
