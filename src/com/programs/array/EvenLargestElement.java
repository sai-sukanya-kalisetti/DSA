package com.programs.array;

import java.util.Scanner;

public class EvenLargestElement {
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
		int large=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]>large && a[i]%2==0)
			{
				large=a[i];
			}
		}
		System.out.println("Even largest among array elements : "+large);
	}
}
