package com.programs.array2;

import java.util.Scanner;

/*Logic: go back and check whether it exists or not*/
public class UniqueElementsCount {
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
		int countOfUnique = 0;
		for(int i=0;i<a.length;i++)
		{
			boolean isPreviouslyPresent = false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isPreviouslyPresent=true;
					break;
				}
			}
			if(isPreviouslyPresent==false)
			{
				countOfUnique++;
			}
		}
		System.out.println("Count of unique elements in array : "+countOfUnique);
	}
}
