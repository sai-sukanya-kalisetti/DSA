package com.programs.array;

import java.util.Scanner;

public class SmallestElement {
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
		int small=a[0];
		for(int i=1;i<size;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("Largest among array elements : "+small);
	}
}
