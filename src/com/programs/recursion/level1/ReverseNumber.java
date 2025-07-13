package com.programs.recursion.level1;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(reverseNumber(1342));
	}

	private static int reverseNumber(int n) {
		//Base condition where sum=0 kind of
		if(n==0)
		{
			return 0; 
		}
		//answer returns from here 
		return n%10+reverseNumber(n/10);
	}

}
