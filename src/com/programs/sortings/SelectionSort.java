package com.programs.sortings;

import java.util.Arrays;

/**
 * pick the last index 
 * find the maximum till last index
 * swap
 */
public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {32,0,-6,26,53,75,44};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			
		}
	}
	static void swap(int[] a, int first, int second) 
	{	
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}

}
