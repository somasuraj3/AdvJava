package com.sh.pizza;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtil {
	public static Properties props;
	static {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		try(InputStream in = classLoader.getResourceAsStream("jdbc.properties")) {
			props = new Properties();
			props.load(in);
			System.out.println("Jdbc properties loaded.");
			String driver = props.getProperty("jdbc.driver");
			//String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection openConnection() throws Exception {
		String url = props.getProperty("jdbc.url");
		String user = props.getProperty("jdbc.user");
		String password = props.getProperty("jdbc.password");
		return DriverManager.getConnection(url, user, password);
	}
}

