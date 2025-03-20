package com.programs.binarySearch;

/**simply - before to target
 * Greatest element in array, smaller or equal to target*/
public class Floor {
	public static void main(String[] args) {
		int[] a = {4,12,35,45,67,89,99};
		int target = 1;
		int resultIndex = floor(a, target);
		System.out.println(resultIndex);
	}
	private static int floor(int[] a, int target) {
		int start = 0;
		int end = a.length-1;
		//edge case - not required because anyway at the end, end becomes -1
		if(target<a[0])
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
		return end;
	}
}
