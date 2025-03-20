package com.programs.leetcode.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 *
 */
public class FindAllDisappearedNumbers {
	public static void main(String[] args) {
		int a[]= {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(a));
		
	}
    static List<Integer> findDisappearedNumbers(int[] a) {
		int i=0;
		while(i<a.length)
		{
			int correct = a[i]-1;
			if(a[i]!=a[correct])
			{
				swap(a,i,correct);
			}
			else
			{
				i++;
			}
		}
		List<Integer> ans = new ArrayList<Integer>();
		for(int index=0;index<a.length;index++)
		{
			if((a[index])!=index+1)
			{
				ans.add(index+1);
			}
		}
		return ans;
    }
    
    static void swap(int[] a, int first, int second) 
	{	
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
}
