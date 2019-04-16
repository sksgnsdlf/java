package co.micol.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/*
 * Dao 클래스
   2019.01.31
   ver 1.0
   micol
*/
public abstract class DaoConn { // Dao 상위클래스
	private String driver;
	private String url;
	private String user;
	private String password;
	public Connection conn;

	private void configuration() {
		try {
			Properties pr = new Properties();
			String path = "config/dbproperties";
			pr.load(new FileReader(path));
			driver = pr.getProperty("driver");
			url = pr.getProperty("url");
			user = pr.getProperty("user");
			password = pr.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DaoConn() {
		configuration();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {

		} catch (SQLException e) {

		}
	}

	public abstract ResultSet select(String sql);

	public abstract int insert(String sql);

	public abstract int update(String sql);

	public abstract int delete(String sql);

	public abstract void selectAll();

	public abstract void close();
}
