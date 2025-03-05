package com.programs.linearSearch;

public class SearchingInRange {
	public static void main(String[] args) {
		int[] a = {23,98,36,84,53};
		int target = 53;
		int resultIndex = linearSearch(a,target,2,4);
		System.out.println(resultIndex);
	}
	//returning index
	static int linearSearch(int[] a, int target, int start, int end) {
		if(a.length==0)
		{
			return -1;
		}
		for(int i=start;i<=end;i++)
		{
			if(a[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}
