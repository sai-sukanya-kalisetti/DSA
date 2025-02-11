package com.programs.array2;

import java.util.Scanner;

public class Sorting {
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
		
		for(int cycle=1;cycle<=a.length-1;cycle++)
		{
			for(int i=0;i<=a.length-2;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
