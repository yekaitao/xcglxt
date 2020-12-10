package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//���ݿ�������
public class DbConnector {
	//���ݿ����Ӷ������������û������롢���ӵ�ַ
	private static Connection con=null;
	private static String dbDriver = "com.mysql.jdbc.Driver";
	private static String dbUser = "root";
	private static String dbPsw = "12345678";
	private static String dbUrl = "jdbc:mysql://127.0.0.1:3306/xcglxt?serverTimezone=UTC";
	
	public static Connection getConnection() {
		//�������ݿ���������
		try {
			Class.forName(dbDriver);
			System.out.println("Loading Driver...");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//�������ݿ�
		try {
			con = DriverManager.getConnection(dbUrl,dbUser,dbPsw);
			System.out.println("Connecting...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
