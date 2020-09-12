package com.plural.reflections;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		try {
			Class<?> c1 = Class.forName("com.plural.reflections.Person");
			System.out.println(c1);
			
			System.out.println("All the public, private, protected fields of Person class -> "+
					Arrays.toString(c1.getDeclaredFields()));
			
			System.out.println("All the public fields of Person class and its super classes -> "+
					Arrays.toString(c1.getFields()));
			
			System.out.println("All the public methods of Person class and its super classes -> "+
					Arrays.toString(c1.getMethods()));
			
			System.out.println("All the public, private, protected methods of Person class and its super classes -> "+
					Arrays.toString(c1.getDeclaredMethods()));
			
			
			System.out.println("All the public, private, protected methods of Person class -> "+
					Arrays.toString(c1.getDeclaredConstructors()));
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not found...");
		}

		
		
		
	}
}