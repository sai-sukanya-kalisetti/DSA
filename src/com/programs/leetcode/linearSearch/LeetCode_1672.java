package com.programs.leetcode.linearSearch;

/**
 You are given an m x n integer grid accounts where accounts[i][j] is the amount of money 
 the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 */
public class LeetCode_1672 {
	
	public static void main(String[] args) {
		int[][] a = {
				{23,98,36,84,53},
				{3,9,6,8,88},
				{56,93}
			};
		int answer = maximumWealth(a);
		System.out.println(answer);
	}
	
    static int maximumWealth(int[][] accounts) {
    	
    	int max = 0;
    	for(int person=0;person<accounts.length;person++)
    	{
    		int sum = 0;
    		for(int account=0;account<accounts[person].length;account++)
    		{
    			sum=sum+accounts[person][account];
    		}
    		if(sum>max)
    		{
    			max=sum;
    		}
    	}
		return max;   
    }
	
}
