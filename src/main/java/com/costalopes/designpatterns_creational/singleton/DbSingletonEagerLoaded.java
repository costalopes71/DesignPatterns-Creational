package com.costalopes.designpatterns_creational.singleton;

public class DbSingletonEagerLoaded {

	// Implementacao eager loaded (ou seja carregada ansiosamente, provavelmente no momento que a JVM carrega
	// as classes do projeto)
	
	private static DbSingletonEagerLoaded dbSingleton = new DbSingletonEagerLoaded();
	
	private DbSingletonEagerLoaded() {	}
	
	public static DbSingletonEagerLoaded getInstance() {
		
		return dbSingleton;
		
	}
	
}
