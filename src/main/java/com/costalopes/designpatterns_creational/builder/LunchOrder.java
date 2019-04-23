package com.costalopes.designpatterns_creational.builder;

/*
 * Um builder nos da o poder de imutabilidade que teriamos usando um modelo construtor (com construtores teles
 * copicos) e nos da a flexibilidade para caso o objeto possa ser construido de varias maneiras que teriamos
 * usando um java bean (getters e setters para cada atributo). Ou seja, um builder junto o melhor das duas
 * abordagens
 */

public class LunchOrder {

	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;

	private LunchOrder(Builder builder) {
		
		bread = builder.bread;
		condiments = builder.condiments;
		dressing = builder.dressing;
		meat = builder.meat;
		
	}
	
	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
	
	public static class Builder {
		
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;

		public Builder() {

		}
		
		public LunchOrder build() {
			
			return new LunchOrder(this);
			
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
	}
	
}
