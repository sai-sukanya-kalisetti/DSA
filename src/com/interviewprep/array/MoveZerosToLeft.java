package com.interviewprep.array;

import java.util.Arrays;

public class MoveZerosToLeft {
	public static void main(String[] args) {
		int [] a = {4,0,5,0,2,0,0};
		int [] result = new int[a.length];
		int index=result.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				result[index--]=a[i];
			}
		}
		
		while(index>=0)
		{
			result[index--]=0;
		}
		System.out.println(Arrays.toString(result));
	}
}
