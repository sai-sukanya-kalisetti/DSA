package com.programs.array;

import java.util.Scanner;

public class CountOfEvenOdd {
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
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
				countEven++;
			}
			else
			{
				countOdd++;
			}
		}
		/*Create 2 arrays*/
		int [] b = new int[countEven];
		int [] c = new int[countOdd];
		int indexB=0;
		int indexC=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[indexB]=a[i];
				indexB++;
			}
			else
			{
				c[indexC]=a[i];
				indexC++;
			}
		}
		/*Print 2 arrays*/
		System.out.println("Even elements");
		for(int k:b)
		{
			System.out.println(k);
		}
		System.out.println("Odd elements");
		for(int k:c)
		{
			System.out.println(k);
		}

	}
}
