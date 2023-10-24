package com.test.codes.patterns.singleton;

public class SingletonDesign {
	

	/* Restrict user from creating a multiple instance, It will return object only once in life cycle.
	 * Where to use?- when we need to create object only once like DB connection establish class here we can go for Singleton Dsa
	 * If you create second instance It will return same create object you can find that in Main.java class */ 
	
	public static SingletonDesign singletonDesign;
	//It cant accessable for any class to create object of this class so no one case create multiple objects 
	public static SingletonDesign getInstance() {
		if(singletonDesign==null) {
			/*A Synchronized block is used to lock an object for any shared resource.
			 * Means in case somehow at same time getInstance() method called it will restrict from creating 
			 * multiple instance */
			synchronized (SingletonDesign.class) {
				if(singletonDesign==null) {
					singletonDesign=new SingletonDesign();
				}
			}
			return singletonDesign;
		}
		return singletonDesign;
	}
	 public String getHelloMessage() {
		 return "Hello->" +singletonDesign.hashCode();
	 }
}
