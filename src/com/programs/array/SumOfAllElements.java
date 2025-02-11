package com.programs.array;

import java.util.Scanner;

public class SumOfAllElements {
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
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements : "+sum);
	}
}
