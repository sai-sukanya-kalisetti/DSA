package com.programs.array;

import java.util.Scanner;

public class InsertElementAtGivenIndex {
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
		System.out.println("Enter index to place new element");
		int index = scan.nextInt();
		
		int [] b = new int[size+1];
		for(int i=0;i<b.length;i++)
		{
			if(i<index)
				b[i]=a[i];
			else if(i==index)
				b[i]=n;
			else if(i>index)
				b[i]=a[i-1];
		}
		System.out.println("New Array:");
		for(int k:b)
		{
			System.out.println(k);
		}
	}
}
