package com.interviewprep.array;

//works for unique elements
public class NthLargest {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int N = 3;
		for(int i=0;i<a.length;i++)
		{
			int count =0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					count++;
				}
			}
			if(count==(N-1))
			{
				System.out.println("Nth largest : "+a[i]);
			}
		}
	}
}
