package com.programs.string;

import java.util.Scanner;

public class LexicographicalOrder {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = scan.nextInt();
		String [] a=new String[size];
		System.out.println("Enter elements one by one");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.next();
		}
		
		for(int cycle=1;cycle<=a.length-1;cycle++)
		{
			for(int i=0;i<=a.length-2;i++)
			{
				if(a[i].compareTo(a[i+1])>0)
				{
					String temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		
		System.out.println("In order");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
