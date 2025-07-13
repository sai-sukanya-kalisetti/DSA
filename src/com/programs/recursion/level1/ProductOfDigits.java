package com.programs.recursion.level1;

public class ProductOfDigits {
	public static void main(String[] args) {
		System.out.println(productOfDigits(1832));
	}

	private static int productOfDigits(int n) {
		//Base condition where product = 1 kind of
		if(n==0)
		{
			return 1; 
		}
		//answer returns from here
		return n%10*productOfDigits(n/10);
	}

}
