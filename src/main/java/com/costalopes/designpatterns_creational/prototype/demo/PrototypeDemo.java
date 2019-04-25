package com.costalopes.designpatterns_creational.prototype.demo;

import com.costalopes.designpatterns_creational.prototype.Movie;
import com.costalopes.designpatterns_creational.prototype.Registry;

/*
 Um padrao prototype serve para evitar ficar instanciando (new) um objeto que eh custoso ser criado.
 Para tanto ele clona uma instancia tornando a construcao desse objeto mto mais leve.
 Garante um nova instancia cada vez que chamo o padrao.
 Ajuda com problemas de performance quando tenho mtos objetos sendo instanciados.
 Tipos de copia: Shallow ou Deep
 */

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Registry registry = new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang Of Four");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
		
	}
	
}
