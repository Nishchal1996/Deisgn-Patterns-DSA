package com.test.codes.patterns.builder;

public class Person {

	private int personAge;
	private String personFirstName;
	private String personLastName;
	
	Person(PersonBuilder personBuilder) {
		super();
		this.personAge = personBuilder.personAge;
		this.personFirstName = personBuilder.personFirstName;
		this.personLastName = personBuilder.personLastName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public String getPersonFirstName() {
		return personFirstName;
	}
	public String getPersonLastName() {
		return personLastName;
	}
	

	@Override
	public String toString() {
		return "Person [personAge=" + personAge + ", personFirstName=" + personFirstName + ", personLastName="
				+ personLastName + "]";
	}


	public static class PersonBuilder{
		
		private int personAge;
		private String personFirstName;
		private String personLastName;
		public PersonBuilder setPersonAge(int personAge) {
			this.personAge = personAge;
			return this;
		}
		public PersonBuilder setPersonFirstName(String personFirstName) {
			this.personFirstName = personFirstName;
			return this;
		}
		public PersonBuilder setPersonLastName(String personLastName) {
			this.personLastName = personLastName;
			return this;
		}
		PersonBuilder() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Person builder() {
			return new Person(this);
		}
	
	}
	
   
}
