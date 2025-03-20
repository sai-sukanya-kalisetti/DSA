package com.programs.sortings;

import java.util.Arrays;

/**
 * for each i-th pass, find the 1st largest element and keep it at 1st largest index
 * for any particular i-th pass, no swap done -> meaning elements are sorted
 */
public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {32,0,-6,26,53,75,44};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	static void bubbleSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			boolean isSwapped=false;
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					swap(a,j,j-1);
				}
			}
			if(!isSwapped)
			{
				break;
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
