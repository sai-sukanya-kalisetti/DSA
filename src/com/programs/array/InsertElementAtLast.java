package com.programs.array;

import java.util.Scanner;

public class InsertElementAtLast {
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
		System.out.println("Enter new element to add at last");
		int n = scan.nextInt();
		
		int [] b = new int[size+1];
		for(int i=0;i<b.length-1;i++)
		{
			b[i]=a[i];
		}
		b[b.length-1]=n;
		System.out.println("New Array:");
		for(int k:b)
		{
			System.out.println(k);
		}
	}
}
