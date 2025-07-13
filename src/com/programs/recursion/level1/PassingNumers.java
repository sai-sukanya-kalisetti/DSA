package com.programs.recursion.level1;

public class PassingNumers {
	public static void main(String[] args) {
		fun(5);
	}

	private static void fun(int n) {
		if(n==0)
		{
			return;
		}
		System.out.println(n);
//		fun(n--);
		//pre-decrement => first decrease and the call method
		fun(--n);
	}
	
}
