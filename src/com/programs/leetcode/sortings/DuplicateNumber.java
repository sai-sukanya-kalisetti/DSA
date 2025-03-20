package com.programs.leetcode.sortings;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
	public static void main(String[] args) {
		int a[]= {1,3,4,2,2};
		System.out.println(findDuplicate(a));
	}
	static int findDuplicate(int[] a)
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
			if((a[index])!=index+1)
			{
				return a[index];
			}
		}
		return -1;
	}
	static void swap(int[] a, int first, int second) 
	{	
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
}
