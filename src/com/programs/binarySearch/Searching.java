package com.programs.binarySearch;


public class Searching {
	public static void main(String[] args) {
		int[] a = {4,12,35,45,67,89,99};
		int[] b = {9,7,5,4,2,1};
		int target = 4;
		int resultIndex = orderAgnosticBinarySearch(b, target);
		System.out.println(resultIndex);
	}
	/**
	 * for ascending order
	 * */
	private static int binarySearch(int[] a, int target) {
		int start = 0;
		int end = a.length-1;
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			
			if(target > a[mid])
			{
				start = mid+1;
			}
			else if(target < a[mid])
			{
				end = mid-1;
			}
			else
			{
				return mid;
			}
			
		}
		return -1;
	}
	
	/**
	 * for both ascending and descending order
	 * */
	private static int orderAgnosticBinarySearch(int[] a, int target) {
		int start = 0;
		int end = a.length-1;
		boolean isAsc = a[start] < a[end] ;
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if(target == a[mid])
			{
				return mid;
			}
			//ascending
			if(isAsc)
			{
				if(target > a[mid])
				{
					start = mid+1;
				}
				else
				{
					end = mid-1;
				}
			}
			//descending
			else
			{
				if(target < a[mid])
				{
					start = mid+1;
				}
				else
				{
					end = mid-1;
				}
			}
		}
		return -1;
	}
	
}
