package com.programs.leetcode.linearSearch;
/**
1295. Find Numbers with Even Number of Digits
**/
public class LeetCode_1295 {
	public static void main(String[] args) {
		int[] a = {12,345,2,6,7896};
		int answer = findNumbers(a);
		System.out.println(answer);
	}
	
	static int findNumbers(int[] nums) {
		
		int answerCount = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(even(nums[i]))
			{
				answerCount++;
			}
		}
		return answerCount;
	}
	static int countOfDigits(int n)
	{
		if(n<0)
		{
			n=n*-1;
		}
		if(n==0)
		{
			return 1;
		}
		int count=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	//Efficient way of counting digits
	static int countOfDigits2(int n)
	{
		return (int)(Math.log10(n))+1;
	}
	static boolean even(int n)
	{
		return countOfDigits(n)%2==0;	
	}
}
