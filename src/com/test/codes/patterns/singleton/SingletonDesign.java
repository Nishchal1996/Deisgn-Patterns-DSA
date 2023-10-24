package com.test.codes.patterns.singleton;

public class SingletonDesign {
	
	public static SingletonDesign singletonDesign;
	
	public static SingletonDesign getInstance() {
		if(singletonDesign==null) {
			
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
