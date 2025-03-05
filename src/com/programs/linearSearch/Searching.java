package com.programs.linearSearch;

public class Searching {
	public static void main(String[] args) {
		int[] a = {23,98,36,84,53};
		int target = 53;
		int resultIndex = linearSearch2(a,target);
		System.out.println(resultIndex);
	}
	//returning index
	static int linearSearch1(int[] a, int target) {
		if(a.length==0)
		{
			return -1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	//returning element
	static int linearSearch2(int[] a, int target) {
		if(a.length==0)
		{
			return Integer.MAX_VALUE;
		}
		for(int element : a)
		{
			if(element==target)
			{
				return element;
			}
		}
		return Integer.MAX_VALUE; // because -1 can be an element
	}
}
