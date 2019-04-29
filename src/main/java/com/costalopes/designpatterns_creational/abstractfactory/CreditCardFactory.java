package com.costalopes.designpatterns_creational.abstractfactory;

import com.costalopes.designpatterns_creational.abstractfactory.creditcard.CreditCard;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		
		if (creditScore > 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
		
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);
	
}
