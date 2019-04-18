package com.costalopes.designpatterns_creational.singleton;

public class DbSingletonLazyLoadedAndThreadSafe {

	private static volatile DbSingletonLazyLoadedAndThreadSafe dbSingleton;
	
	private DbSingletonLazyLoadedAndThreadSafe() {

		if (dbSingleton != null) {
			// protejendo o Singleton contra outras classes que podem tentar criar uma nova instancia atraves de reflection
			throw new RuntimeException("Use getInstance() method to create an instance! Do not use reflection!");
		}
		
	}
	
	// tornando o singleton thread safe! Faco o double check para ter certeza que mesmo que duas threads estejam dentro do
	// primeiro if apenas uma passara pelo segundo if (pois o segundo if esta sincronizado)
	public static DbSingletonLazyLoadedAndThreadSafe getInstance() {
		
		if (dbSingleton == null) {
			
			synchronized (DbSingletonLazyLoadedAndThreadSafe.class) {
				if (dbSingleton == null) {
					dbSingleton = new DbSingletonLazyLoadedAndThreadSafe();
				}
			}
			
		}
		
		return dbSingleton;
	}
	
}
