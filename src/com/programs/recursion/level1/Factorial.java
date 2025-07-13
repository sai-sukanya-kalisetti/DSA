package com.programs.recursion.level1;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(fact(4));
	}

	private static int fact(int n) {
		//Base condition where factorial of 1 and 0 are 1
		if(n<=1)
		{
			return 1; 
		}
		return n*fact(n-1);
	}

}
