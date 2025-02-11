package com.programs.array2;

import java.util.Scanner;

public class CommonElements {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter size of A array");
		int sizeA = scan.nextInt();
		int [] a=new int[sizeA];
		System.out.println("Enter elements one by one:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter size of B array");
		int sizeB = scan.nextInt();
		int [] b=new int[sizeB];
		System.out.println("Enter elements one by one:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=scan.nextInt();
		}
		
		System.out.println("Common elements are : ");
		int commonCount = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					commonCount++;
					break;
				}
			}
		}
	}
}
