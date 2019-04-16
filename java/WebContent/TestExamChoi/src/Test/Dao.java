package Test;

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
	
	private void init() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		path = "config/db.properties";
		pro.load(new FileReader(path));
		driver = pro.getProperty("driver");
		url = pro.getProperty("url");
		user = pro.getProperty("user");
		password = pro.getProperty("password");
	}
	public Dao() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException{
		init();
		Class.forName(driver);
		conn = DriverManager.getConnection(url,user,password);
	}
	
	public abstract ResultSet select(String sql);
	public abstract int insert(String sql);
	public abstract int update(String sql);
	public abstract int delete(String sql);
	public abstract void close();
}
