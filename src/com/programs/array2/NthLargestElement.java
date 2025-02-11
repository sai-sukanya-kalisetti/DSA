package com.programs.array2;

import java.util.Scanner;

/*Logic: finding number of ahead elements
 * eg: 4th largest in {10,20,30,40,50} is 20 
 * ahead elements : 50,40,30 -> 3*/
public class NthLargestElement {
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
		
		System.out.println("Enter which largest element");
		int n=scan.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			int aHeadElementsCount = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					aHeadElementsCount++;
				}
			}
			if(aHeadElementsCount==(n-1))
			{
				System.out.println(n+"th largest element is "+a[i]);
			}
		}
	}
}
