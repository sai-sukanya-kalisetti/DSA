package com.programs.array;

import java.util.Scanner;

public class EvenSmallest {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = scan.nextInt();
		int [] a=new int[size];
		System.out.println("Enter elements one by one");
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();
		}
		int small=0;
		/*To ensure a[0] is not odd*/
		for(int i=0;i<size-1;i++)
		{
			if(a[i]%2==0)
			{
				small=a[i];
				break;
			}
		}
		for(int i=0;i<size-1;i++)
		{
			if(a[i]<small && a[i]%2==0)
			{
				small=a[i];
			}
		}
		System.out.println("Even Smallest among array elements : "+small);
	}
}
