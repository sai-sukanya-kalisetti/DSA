package com.programs.array2;

import java.util.Scanner;

public class NoOfTimesOccurrance {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = scan.nextInt();
		int [] a=new int[size];
		System.out.println("Enter elements one by one");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			boolean isPreviouslyPresent = false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isPreviouslyPresent=true;
					break;
				}
			}
			if(isPreviouslyPresent==false)
			{
				System.out.println(a[i]+" occured "+count+" time/s");
			}
		}
	}
}
