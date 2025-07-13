package com.interviewprep.array;

import java.util.Arrays;

public class CheckBothArraysEqual {
	public static void main(String[] args) {
		int [] a = {4,7,5,1,2,0,8};
		int [] b = {2,5,8,1,4,7,0};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(a.length==b.length&&Arrays.equals(a, b))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal ");
		}
	}
}
