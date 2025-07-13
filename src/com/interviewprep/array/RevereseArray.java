package com.interviewprep.array;

import java.util.Arrays;

public class RevereseArray {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9};
		
		int start=0;
		int end=a.length-1;
		
		while(start<end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
		 System.out.println("After reversing : "+Arrays.toString(a));
		
	}
}
