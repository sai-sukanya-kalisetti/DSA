package com.programs.array2;

import java.util.Scanner;

public class Searching {
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
		
		System.out.println("Enter element to search");
		int searchElement = scan.nextInt();
		boolean isPresent = false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==searchElement)
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent)
		{
			System.out.println("element exists");
		}
		else
		{
			System.out.println("element NOT exists");
		}
	}
}
