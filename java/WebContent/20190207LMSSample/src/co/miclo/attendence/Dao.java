package co.miclo.attendence;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public abstract class Dao {
	private String driver;
	private String url;
	private String user;
	private String password;
	private String path;
	
	public Connection conn;
	
	private void configuration() throws FileNotFoundException, IOException { //Properties파일 읽기
		Properties per = new Properties();
		path = "donfig/dbproperties";
		per.load(new FileReader(path));
		driver = per.getProperty("driver");
		url = per.getProperty("url");
		user = per.getProperty("user");
		password = per.getProperty("password");
	}
	
	public Dao() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException{
		configuration();
		Class.forName(driver);
		conn = DriverManager.getConnection(url,user,password);
	}
	
	public abstract ResultSet select(String sql);
	public abstract int insert(String sql);
	public abstract int delete(String sql);
	public abstract int update(String sql);
	public abstract void close();
}
