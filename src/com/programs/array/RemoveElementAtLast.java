package com.programs.array;

import java.util.Scanner;

public class RemoveElementAtLast {
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
		
		int [] b = new int[a.length-1];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("New Array:");
		for(int k:b)
		{
			System.out.println(k);
		}
	}
}
