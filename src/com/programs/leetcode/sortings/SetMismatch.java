package com.programs.leetcode.sortings;

import java.util.Arrays;

public class SetMismatch {
	public static void main(String[] args) {
		int a[]= {1,2,2,4};	
		System.out.println(Arrays.toString(findErrorNums(a)));
	}
	
	 static int[] findErrorNums(int[] a) 
	 {
		 int i=0;
		 while(i<a.length)
		 {
			 int correct = a[i]-1;
			 if(a[i]!=a[correct])
			 {
				 swap(a,i,correct);
			 }
			 else
			 {
				 i++;
			 }
		 }
		 for(int index=0;index<a.length;index++)
		 {
			 if(a[index]!=index+1)
			 {
				 return new int[] {a[index],index+1};
			 }
		 }
		 return new int[] {-1,-1};
	 }
	 static void swap(int[] a, int first, int second) 
		{	
			int temp = a[first];
			a[first] = a[second];
			a[second] = temp;
		}
}
