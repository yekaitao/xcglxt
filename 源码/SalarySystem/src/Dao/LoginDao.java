package Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import modelItem.User;

//检测用户登录，并返回查到到的结果对应的user
public class LoginDao {
	public User checkUser(String userName,String userPsw) {
		User user = null;
		List<String> list = new ArrayList<>();
		list.add(userName);
		list.add(userPsw);
		String sql = "select * from user where userName=? and psw=?";
		Vector<String> v = null;
		try {
			//返回查询结果
			v = BaseDao.select(sql, list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//如果查询结果不为空就可以转为user
		//但在BaseDao类的select方法里已经创建了vector所以要判断vector里是否有内容
		if(v.size()>1) {
			//将vector转为user
			user = new UserDao().creatUser(v);
		}
		return user;
	}
	
}
