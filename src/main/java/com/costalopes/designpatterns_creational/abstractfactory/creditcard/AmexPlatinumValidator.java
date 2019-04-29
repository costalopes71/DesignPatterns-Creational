package com.costalopes.designpatterns_creational.abstractfactory.creditcard;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
