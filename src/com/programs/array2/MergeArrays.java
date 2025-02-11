package com.programs.array2;

import java.util.Scanner;

public class MergeArrays {
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
		
		int [] c=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
		System.out.println("After Merging : ");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);;
		}
	}
}
