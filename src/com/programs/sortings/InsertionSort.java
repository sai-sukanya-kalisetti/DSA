package com.programs.sortings;

import java.util.Arrays;

/**
 * for each i-th pass, sort till i+1
 * for any particular i-th pass, no swap done for j ->meaning elements are sorted till that i+1
 */
public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {32,0,-6,26,53,99,75,44};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	static void insertionSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					swap(a,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
	}
	static void swap(int[] a, int first, int second) 
	{	
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}

}
