package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	
	//single comment
	
	/* Multi
	 * line comment
	 * Ha Ha
	 */
	
	/* 
	 * Why Java?
	 * "WORA" principle
	 * 			"Write once, Run anywhere"
	 * OOP
	 * Widespread use
	 * Great Documentation
	 * Oracle
	 * 		Sun Microsystem used to own it
	 * version 1.8 "Java 8" 
	 * 
	 * 3 common accronyms -- JDK, JRK, JVM
	 * 	JVM - Java Virtual Machine
	 * 			Converts compiled Java code into machine code that your processor can understand 
	 * 			Provides portability
	 * 	
	 * 	JRE - Java Runtime Environment
	 * 			JVM + Libraries
	 * 			Everything that we need to RUN java
	 * 
	 * 	JDK - Java Development Kit
	 * 		  Contain JVM + JDK
	 * 		  Compiler, etc...
	 * 		  Everything we need to WRITE Java
	 * 
	 * 	Object Oriented Programming
	 * 			Java is ^!
	 * 			unit of programmability is the object
	 * 			Objects have states and behavior
	 * 			States - aka fields, attributes, variables etc.
	 * 			Behaviors- methods
	 * 			Classes - blueprint or template of an object  	 		
	 */
	public static void main(String[] args) {
		/*
		 * public - access modifier, everything can access it.
		 * static - do not need to instantiate to use/belongs to the class
		 * void - doesn't return anything
		 * String [] args - parameter(s) used for this method
		 * 
		 */
		System.out.println("Go Team ");
		System.out.println("Roll Tide");
		
		Human h = new Human();
		System.out.println(h);
		
		h.setName("Kawkab");
		h.setAge(22);
		h.setWeight(145);
		System.out.println(h.getName());
		
	}

}
