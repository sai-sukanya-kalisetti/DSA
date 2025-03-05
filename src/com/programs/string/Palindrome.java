package com.programs.string;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();   //next() will take input till space 
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
}
