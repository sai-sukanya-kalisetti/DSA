package com.interviewprep.array;

import java.util.Arrays;

public class MoveZerosToRight {
	public static void main(String[] args) {
		int [] a = {2,0,5,0,2,0,0,0,0,8,0,9};
		int [] result = new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				result[index++]=a[i];
			}
		}
		while(index<a.length)
		{
			result[index++]=0;
		}
		System.out.println(Arrays.toString(result));
	}
}
