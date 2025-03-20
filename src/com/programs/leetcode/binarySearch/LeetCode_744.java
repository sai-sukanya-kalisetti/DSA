package com.programs.leetcode.binarySearch;

/**
 744. Find Smallest Letter Greater Than Target
 Input: letters = ["c","f","j"], target = "a"
 Output: "c"
 
 Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
 */
public class LeetCode_744 {
	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		char target = 'c';
		System.out.println(binarySearch(letters,target));
	}
	private static char binarySearch(char[] a, char target) {
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
			//don't return mid, because only greater than target should be returned
			
		}
		return a[start%a.length]; //because letters wrap around
	}

}
