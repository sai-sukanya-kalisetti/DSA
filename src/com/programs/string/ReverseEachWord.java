package com.programs.string;

import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine(); 	//"how are you"
		String [] a=s.split(" ");		//how,are,you
		String s2=""; 
		for(int i=0;i<a.length;i++)
		{
			String rev = "";
			for(int j=a[i].length()-1;j>=0;j--)
			{
				rev=rev+a[i].charAt(j);
			}
			
			s2=s2+rev+" ";
		}
		System.out.println("Reversed string");
		System.out.println(s2);
	}
}
