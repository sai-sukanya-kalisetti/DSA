package com.programs.linearSearch;

import java.util.Arrays;

public class SearchingIn2D {
	public static void main(String[] args) {
		int[][] a = {
						{23,98,36,84,53},
						{3,9,6,8,88},
						{56,93}
					};
		int target = 88;
		int[] resultIndexArray = linearSearch1(a,target);
		System.out.println(Arrays.toString(resultIndexArray));
	}
	//returning index in seperate array
	static int[] linearSearch1(int[][] a, int target) {
		if(a.length==0)
		{
			return new int[] {-1,-1};
		}
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				if(a[row][col]==target)
				{
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
}
