package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import modelItem.User;

//User封装
public class UserDao {

	private User user = null;
	
	//通过用户名获取User对象
	public User getUser(String userId) {
		List<String> list = new ArrayList<>();
		list.add(userId);
		String sql = "select * from user where userId = ?";
		Vector<String> v = null;
		try {
			v = BaseDao.select(sql, list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(v!=null) {
			User user = new User();
			user.setUserId(v.get(0));
			user.setUserName(v.get(1));
			user.setUserPsw(v.get(2));
			user.setSex(v.get(3));
			user.setDepartment(v.get(4));
			user.setPost(v.get(5));
			user.setProfessionalTitle(v.get(6));
			user.setmTOA_State(v.get(7));
			user.setBaseAllowanceState(v.get(8));
			user.setDutyAllowanceState(v.get(9));
			user.setTelAllowanceState(v.get(10));
			user.setLoginAuthority(v.get(11));
		}
		return user;
	}

	//通过用户名获取多个用户
	public Vector<User> getUsers(List userIdList){
		Vector<User> users = new Vector<>();
		Vector<Vector<String>> vectors = new Vector<>();
		String sql = "select * from user";
		List<String> list = new ArrayList<>();
		try {
			vectors = BaseDao.selectAll(sql, list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(Vector<String> x:vectors) {
			User user = new User();
			user = creatUser(x);
			users.add(user);
		}
		return users;
	}
	
	//方法功能：添加用户，把传递进来的用户类的数据存进list里
	public int addUser(User user) throws SQLException {
		List<String> list = new ArrayList<>();
		list.add(user.getUserId());
		list.add(user.getUserName());
		list.add(user.getUserPsw());
		list.add(user.getSex());
		list.add(user.getDepartment());
		list.add(user.getPost());
		list.add(user.getmTOA_State());
		list.add(user.getBaseAllowanceState());
		list.add(user.getDutyAllowanceState());
		list.add(user.getTelAllowanceState());
		list.add(user.getProfessionalTitle());
		list.add(user.getLoginAuthority());
		String sql1 = "userId,userName,psw,sex,department,post,mTAO_State,baseAllowanceState,dutyAllowanceState,telAllowanceState,professionalTitle,loginAuthority";
		String sql = "insert into user("+sql1+") values (?,?,?,?,?,?,?,?,?,?,?,?)";
		//把封装好的sql语句传递给数据库操作类BaseDao的插入函数
		return BaseDao.insert(sql, list);
	}
	
	//更新用户信息
	public int updateUser(User user) {
		List<String> list = new ArrayList<>();
		list.add(user.getUserName());
		list.add(user.getUserPsw());
		list.add(user.getSex());
		list.add(user.getDepartment());
		list.add(user.getPost());
		list.add(user.getProfessionalTitle());
		list.add(user.getmTOA_State());
		list.add(user.getBaseAllowanceState());
		list.add(user.getDutyAllowanceState());
		list.add(user.getTelAllowanceState());
		list.add(user.getLoginAuthority());
		
		list.add(user.getUserId());
		String sql1 = "userName=?,psw=?,sex=?,department=?,post=?,professionalTitle=?,mTAO_State=?,baseAllowanceState=?,dutyAllowanceState=?,telAllowanceState=?,loginAuthority=?";
		String sql = "update user set "+sql1+"where userId=?";
		int updateCount = 0;
		try {
			updateCount = BaseDao.update(sql, list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateCount;
	}
	
	//通过用户名获取user实例
	public User getUserByName(String userName) {
		List<String> list = new ArrayList<>();
		list.add(userName);
		Vector<String> v = null;
		String sql = "select * from user where userName =?";
		try {
			v = BaseDao.select(sql, list);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		if(v!=null)
		{
		user = new User();
		
		user = creatUser(v);	
		}		
		return user;
	}
	
	public User creatUser(Vector<String> v) {
		User user = new User();
		user.setUserId(v.get(0));
		user.setUserName(v.get(1));
		user.setUserPsw(v.get(2));
		user.setSex(v.get(3));
		user.setDepartment(v.get(4));
		user.setPost(v.get(5));
		user.setProfessionalTitle(v.get(6));
		user.setmTOA_State(v.get(7));
		user.setBaseAllowanceState(v.get(8));
		user.setDutyAllowanceState(v.get(9));
		user.setTelAllowanceState(v.get(10));
		user.setLoginAuthority(v.get(11));
		return user;
	}
	
	public User setUser(Vector userAttributes) {
		return null;
	}
	
	public List getUserAttributesList(User user) {
		return null;
	}
}
