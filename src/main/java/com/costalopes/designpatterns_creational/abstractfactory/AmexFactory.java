package com.costalopes.designpatterns_creational.abstractfactory;

import com.costalopes.designpatterns_creational.abstractfactory.creditcard.AmexGoldCreditCard;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.AmexGoldValidator;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.AmexPlatinumCreditCard;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.AmexPlatinumValidator;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.CreditCard;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
	
			case PLATINUM:
				return new AmexPlatinumCreditCard();	
				
			default:
				break;
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		
		switch (cardType) {
			case GOLD:
				
				return new AmexGoldValidator();
	
			case PLATINUM:
				
				return new AmexPlatinumValidator();	
		
		}
		
		return null;
	}
}
