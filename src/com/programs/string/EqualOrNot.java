package com.programs.string;

import java.util.Scanner;

public class EqualOrNot {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = scan.nextLine();
		System.out.println("Enter second String");
		String s2 = scan.nextLine();
		boolean isEqual=true;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i)) {
				isEqual=false;
				break;
			}
		}
		if(isEqual)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are NOT equal");
		}
	}
}
