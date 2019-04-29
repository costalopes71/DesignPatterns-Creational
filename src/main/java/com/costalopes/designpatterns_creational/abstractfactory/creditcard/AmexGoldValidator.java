package com.costalopes.designpatterns_creational.abstractfactory.creditcard;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
