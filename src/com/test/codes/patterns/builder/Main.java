package com.test.codes.patterns.builder;


public class Main {
	
	public static void main(String[] args) {
		
		 
		Person p1=new Person.PersonBuilder()
				.setPersonAge(27)
				.setPersonFirstName("Nishchal")
				.setPersonLastName("Shrirame")
				.build();
		System.out.println(p1);
		
	}

}
