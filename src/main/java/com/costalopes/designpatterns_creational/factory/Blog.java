package com.costalopes.designpatterns_creational.factory;

import com.costalopes.designpatterns_creational.factory.pages.AboutPage;
import com.costalopes.designpatterns_creational.factory.pages.CommentPage;
import com.costalopes.designpatterns_creational.factory.pages.ContactPage;
import com.costalopes.designpatterns_creational.factory.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
