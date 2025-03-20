package com.programs.sortings;

import java.util.Arrays;

/**
 * IMPORTANT - apply this for pattern (o to n)
 * check - swap - move
 */
public class CyclicSort {
	public static void main(String[] args) {
		int a[]= {3,4,1,5,2};
		cyclicSort(a);
		System.out.println(Arrays.toString(a));
	}
	static void cyclicSort(int[] a)
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
	}
	static void swap(int[] a, int first, int second) 
	{	
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}

}
