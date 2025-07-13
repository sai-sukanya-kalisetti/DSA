package com.programs.recursion.basic;

/**
 * Divide and Conquer recurrence relation
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int a[] = {2,99,4,9,7,9};
		System.out.println(binarySearch(a,9,0,a.length-1));
	}

	private static int binarySearch(int[] a, int target, int start, int end) {
		if(start>end)
		{
			return -1;
		}
		int mid = start +(end-start)/2;
		if(target==a[mid])
		{
			return mid;
		}
		if(target>a[mid])
		{
			return binarySearch(a, target, mid+1, end);
		}
		return binarySearch(a, target, start, mid-1);	
	}
}
