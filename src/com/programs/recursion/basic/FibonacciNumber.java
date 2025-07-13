package com.programs.recursion.basic;

/**
 * Fibo(n) = Fibo(n-1) + Fibo(n-2);
 *
 */
public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(fibo(6));
	}

	private static int fibo(int n) {
		//Base condition for F(1)=1 and F(0)=0 - STOP future calls
		if(n<2)
		{
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	

}
