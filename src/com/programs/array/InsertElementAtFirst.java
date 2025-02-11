package com.programs.array;

import java.util.Scanner;

public class InsertElementAtFirst {
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
		System.out.println("Enter new element to add at first");
		int n = scan.nextInt();
		
		int [] b = new int[size+1];
		b[0]=n;
		for(int i=1;i<b.length;i++)
		{
			b[i]=a[i-1];
		}
		
		System.out.println("New Array:");
		for(int k:b)
		{
			System.out.println(k);
		}
	}
}
