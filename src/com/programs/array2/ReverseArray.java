package com.programs.array2;

import java.util.Scanner;

public class ReverseArray {
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
		//swapping count
		int swappingCount = a.length/2;
		int x=0;
		int y=a.length-1;
		for(int i=1;i<=swappingCount;i++)
		{
			int temp = a[x];
			a[x] = a[y];
			a[y] = temp;
			x++;
			y--;
		}
		System.out.println("After reversing: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
