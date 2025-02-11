package com.programs.array;

import java.util.Scanner;

public class Average {
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
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		int avg = sum/a.length;
		System.out.println("Average of array elements : "+avg);
	}
}
