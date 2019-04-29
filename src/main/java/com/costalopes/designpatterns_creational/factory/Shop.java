package com.costalopes.designpatterns_creational.factory;

import com.costalopes.designpatterns_creational.factory.pages.CartPage;
import com.costalopes.designpatterns_creational.factory.pages.ItemPage;
import com.costalopes.designpatterns_creational.factory.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
