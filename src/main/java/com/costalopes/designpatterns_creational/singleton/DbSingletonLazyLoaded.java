package com.costalopes.designpatterns_creational.singleton;

public class DbSingletonLazyLoaded {

	/*
	 Nesta implementacao tornamos o singleton lazy loaded ao instanciar o atributo apenas quando requerido pelo
	 codigo cliente!
	 */
	
	private static DbSingletonLazyLoaded dbSingleton;
	
	private DbSingletonLazyLoaded() { }
	
	public static DbSingletonLazyLoaded getInstance() {
		
		if (dbSingleton == null) {
			
			dbSingleton = new DbSingletonLazyLoaded();
			
		}
		
		return dbSingleton;
	}
	
}
