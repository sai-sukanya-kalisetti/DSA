package com.programs.recursion.level1;

/**
 * Print 1 to N, N to 1.....
 *
 */
public class Print {
	public static void main(String[] args) {
		int n=5;
		printBoth(n);
	}

	private static void printNto1(int n) {
		if(n<1)
		{
			return;
		}
		System.out.println(n);
		printNto1(n-1);
		
	}
	//Print 1 to n using passing 5 as first 
	private static void print1toN(int n) {
		if(n<1)
		{
			return;
		}
		print1toN(n-1);
		System.out.println(n);
	}
	//Print n to 1 and 1 to n using passing 5 as first 
		private static void printBoth(int n) {
			if(n<1)
			{
				return;
			}
			System.out.println(n);
			printBoth(n-1);
			System.out.println(n);
		}

}
