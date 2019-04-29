package com.costalopes.designpatterns_creational.factory;

import java.util.ArrayList;
import java.util.List;

import com.costalopes.designpatterns_creational.factory.pages.Page;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();
	
	public Website() {
		// template method =D
		this.createWebsite();
	}
	
	public List<Page> getPages() {
		return pages;
	}

	// obrigando as subclasses a implementarem o template method
	public abstract void createWebsite();
	
}
