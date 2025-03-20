package com.programs.binarySearch;

/**simply - next to target
 * Smallest element in array, greater or equal to target*/
public class Ceiling {
	public static void main(String[] args) {
		int[] a = {4,12,35,45,67,89,99};
		int target = 100;
		int resultIndex = ceiling(a, target);
		System.out.println(resultIndex);
	}
	private static int ceiling(int[] a, int target) {
		int start = 0;
		int end = a.length-1;
		//edge case
		if(target>a[a.length-1])
		{
			return -1;
		}
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
		return start;
	}
}
