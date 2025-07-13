package com.programs.recursion.level1;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(1342));
	}

	private static int sumOfDigits(int n) {
		//Base condition where sum=0 kind of
		if(n==0)
		{
			return 0; 
		}
		//answer returns from here
		return n%10+sumOfDigits(n/10);
	}

}
