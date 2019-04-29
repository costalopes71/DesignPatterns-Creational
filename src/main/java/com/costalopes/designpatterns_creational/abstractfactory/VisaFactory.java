package com.costalopes.designpatterns_creational.abstractfactory;

import com.costalopes.designpatterns_creational.abstractfactory.creditcard.CreditCard;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.Validator;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.VisaBlackCreditCard;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.VisaGoldCreditCard;
import com.costalopes.designpatterns_creational.abstractfactory.creditcard.VisaValidator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				
				return new VisaBlackCreditCard();	
			
		}
		
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
