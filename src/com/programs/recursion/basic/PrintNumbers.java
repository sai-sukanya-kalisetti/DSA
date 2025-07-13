package com.programs.recursion.basic;

/**
 * Recursion
 *
 */
public class PrintNumbers {
	public static void main(String[] args) {
		print(1);
	}
	public static void print(int n)
	{
		//Base condition- where recursion stops future calls 
		if(n>5)
		{
			return;
		}
		System.out.println(n);
		print(n+1);
	}
}
