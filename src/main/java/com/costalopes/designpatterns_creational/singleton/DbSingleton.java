package com.costalopes.designpatterns_creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.EmbeddedDriver;

public class DbSingleton {

	private static volatile DbSingleton instance;
	private static volatile Connection conn;
	
	private DbSingleton() {
		
		try {
			DriverManager.registerDriver(new EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (conn != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
		
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
		
	}
	
	public static DbSingleton getInstance() {
		
		if (instance == null) {
			
			synchronized (DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
			
		}
		
		return instance;
	}
	
	public Connection getConnection() {
		
		if (conn == null) {
			
			synchronized (DbSingleton.class) {
				if (conn == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		
		return conn;
	}
			
}
