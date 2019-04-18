package com.costalopes.designpatterns_creational.singleton;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;

import org.junit.Test;

public class DbSingletonTestCase {

	@Test
	public void testGetInstance() {
		
		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);
		
		DbSingleton newInstance = DbSingleton.getInstance();
		System.out.println(newInstance);
		
		assertEquals(instance, newInstance);
	
	}

	@SuppressWarnings("unused")
	@Test(expected=InvocationTargetException.class)
	public void testTryingToInstatiateViaReflection() throws InvocationTargetException {
		
		DbSingleton instance = DbSingleton.getInstance();
		
		try {
			Constructor<DbSingleton> constructor = 
					DbSingleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			DbSingleton newInstance = constructor.newInstance();
			
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			fail("did not throw runtime exception (invocation excetion) as expected");
		}
		
	}
	
	@Test
	public void testGetConnection() {

		DbSingleton instance = DbSingleton.getInstance();
		Connection conn = instance.getConnection();
		System.out.println(conn);
		
		DbSingleton newInstance = DbSingleton.getInstance();
		Connection newConn = newInstance.getConnection();
		System.out.println(newConn);
		
		assertEquals(conn, newConn);
		
	}

}
