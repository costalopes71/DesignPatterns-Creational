package com.costalopes.designpatterns_creational.singleton.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.costalopes.designpatterns_creational.singleton.DbSingleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton instance = DbSingleton.getInstance();

		long timeBefore = 0;
		long timeAfter = 0;

		System.out.println(instance);

		timeBefore = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);

		Statement sta = null;
		try {
			sta = conn.createStatement();
			sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," + " City VARCHAR(20))");
			System.out.println("Table created.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		timeBefore = System.currentTimeMillis();
		conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);

		System.out.println(conn);

		try {
			sta.executeUpdate("INSERT INTO Address (id, StreetName, City) VALUES (34, 'Rua Fiorva, 33', 'Sao Paulo')");
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			ResultSet rs = sta.executeQuery("Select * from Address");

			System.out.println(rs);

			while (rs.next()) {
				
				int id = rs.getInt(1);
				String street = rs.getString(2);
				String city = rs.getString(3);
				System.out.println(id);
				System.out.println(street);
				System.out.println(city);
			}
			
			sta.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
