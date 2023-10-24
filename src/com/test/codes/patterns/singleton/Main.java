package com.test.codes.patterns.singleton;

public class Main {
	
	public static void main(String[] args) {
		 
		SingletonDesign design=SingletonDesign.getInstance();
		System.out.println(design.getHelloMessage());
		
		SingletonDesign design2=SingletonDesign.getInstance();
		System.out.println(design2.getHelloMessage());
	}

}
