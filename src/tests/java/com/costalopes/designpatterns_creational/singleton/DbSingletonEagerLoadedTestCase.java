package com.costalopes.designpatterns_creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class DbSingletonEagerLoadedTestCase {

	@Test
	public void testGetInstance() {

		DbSingletonEagerLoaded instance = DbSingletonEagerLoaded.getInstance();
		System.out.println(instance);
		
		DbSingletonEagerLoaded newInstance = DbSingletonEagerLoaded.getInstance();
		System.out.println(newInstance);
		
		assertEquals(instance, newInstance);
	}

}
