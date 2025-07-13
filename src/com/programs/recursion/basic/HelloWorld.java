package com.programs.recursion.basic;

/**
 * 
 * Intro to Recursion
 * Print hello-world 4 times -don't write in single method
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		message();
	}
	public static void message()
	{
		System.out.println("Hello world");
		message1();
	}
	public static void message1()
	{
		System.out.println("Hello world");
		message2();
	}
	public static void message2()
	{
		System.out.println("Hello world");
		message3();
	}
	public static void message3()
	{
		System.out.println("Hello world");
	}
	//every method is doing same i.e - method signature and method implementation 
	//using recursion
	
}
