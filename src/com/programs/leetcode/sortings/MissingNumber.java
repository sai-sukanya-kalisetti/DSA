package com.programs.leetcode.sortings;

import java.util.Arrays;
/**
 * Problem:-268
 * https://leetcode.com/problems/missing-number/description/
 *
 *condition:- i<a.length 
 *because it is starting from 0 
 *this is because to avoid AIOBE since 0 to 4 element contains o to 4 index only
 */
public class MissingNumber {
	public static void main(String[] args) {
		int a[]= {3,4,1,5,2};	
		System.out.println(missingNumber(a));;
		
	}
	static int missingNumber(int[] a)
	{
		int i=0;
		while(i<a.length)
		{
			int correct = a[i];
			if(a[i]<a.length && a[i]!=a[correct])
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
			if(a[index]!=index)
			{
				return index;
			}
		}
		return a.length;
	}
	static void swap(int[] a, int first, int second) 
	{	
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
}
