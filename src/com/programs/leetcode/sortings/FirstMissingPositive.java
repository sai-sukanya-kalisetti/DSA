package com.programs.leetcode.sortings;

import java.util.Arrays;
/**
 * Problem:-41 
 * https://leetcode.com/problems/first-missing-positive/
 *
 *condition:- a[i]>0 && a[i]<a.length
 *because it is starting from 0 
 *this is because to avoid AIOBE since 0 to 4 element contains o to 4 index only
 */
public class FirstMissingPositive {
	public static void main(String[] args) {
		int a[]= {3,4,-1,1};	
		System.out.println(firstMissingPositive(a));;
		
	}
	static int firstMissingPositive(int[] a)
	{
		int i=0;
		while(i<a.length)
		{
			int correct = a[i]-1;
			if(a[i]>0 && a[i]<a.length && a[i]!=a[correct])
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
				return index+1;
			}
		}
		return a.length+1; //means all numbers from 1 to n are existing
	}
	static void swap(int[] a, int first, int second) 
	{	
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
}
