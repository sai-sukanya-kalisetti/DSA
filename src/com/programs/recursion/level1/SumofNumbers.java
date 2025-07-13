package com.programs.recursion.level1;

public class SumofNumbers {
	public static void main(String[] args) {
		System.out.println(sum(4));
	}

	private static int sum(int n) {
		//Base condition where factorial of 1 and 0 are 1
		if(n<1)
		{
			return 0; 
		}
		return n+sum(n-1);
	}
}
