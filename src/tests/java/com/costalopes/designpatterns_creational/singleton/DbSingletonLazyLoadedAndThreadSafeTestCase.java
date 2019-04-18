package com.costalopes.designpatterns_creational.singleton;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class DbSingletonLazyLoadedAndThreadSafeTestCase {

	@Test
	public void testGetInstance() {

		DbSingletonLazyLoadedAndThreadSafe instance = DbSingletonLazyLoadedAndThreadSafe.getInstance();
		System.out.println(instance);
		
		DbSingletonLazyLoadedAndThreadSafe newInstance = DbSingletonLazyLoadedAndThreadSafe.getInstance();
		System.out.println(newInstance);
		
		assertEquals(instance, newInstance);
	
	}

	@SuppressWarnings("unused")
	@Test(expected=InvocationTargetException.class)
	public void testTryingToInstatiateViaReflection() throws InvocationTargetException {
		
		DbSingletonLazyLoadedAndThreadSafe instance = DbSingletonLazyLoadedAndThreadSafe.getInstance();
		
		try {
			Constructor<DbSingletonLazyLoadedAndThreadSafe> constructor = 
					DbSingletonLazyLoadedAndThreadSafe.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			DbSingletonLazyLoadedAndThreadSafe newInstance = constructor.newInstance();
			
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			fail("did not throw runtime exception (invocation excetion) as expected");
		}
		
	}
	
}
