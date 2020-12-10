package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//数据库连接类
public class DbConnector {
	//数据库连接对象、驱动名、用户和密码、连接地址
	private static Connection con=null;
	private static String dbDriver = "com.mysql.jdbc.Driver";
	private static String dbUser = "root";
	private static String dbPsw = "12345678";
	private static String dbUrl = "jdbc:mysql://127.0.0.1:3306/xcglxt?serverTimezone=UTC";
	
	public static Connection getConnection() {
		//加载数据库连接驱动
		try {
			Class.forName(dbDriver);
			System.out.println("Loading Driver...");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//连接数据库
		try {
			con = DriverManager.getConnection(dbUrl,dbUser,dbPsw);
			System.out.println("Connecting...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
