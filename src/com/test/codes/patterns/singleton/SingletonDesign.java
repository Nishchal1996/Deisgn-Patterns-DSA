package com.test.codes.patterns.singleton;

public class SingletonDesign {
	
	private static SingletonDesign design;

	public SingletonDesign() {
		System.out.println("Singleton Object has been created");
	}
	
	public static SingletonDesign getInstance() {
		if(design==null) {
			design= new SingletonDesign();
			return design;
		}
		else
			return design;
	}
	  public String getMessage(){
	        return "Hello "+design.hashCode();
	    }
	
	

}
