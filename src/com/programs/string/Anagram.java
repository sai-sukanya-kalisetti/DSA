package com.programs.string;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String s1=scan.next();
		String s2=scan.next();
		
		boolean isAllCharPresent = true;
		for(int i=0;i<s1.length();i++)
		{
			boolean isS1PresentInS2 = false;
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					isS1PresentInS2 = true;
				}
			}
			
			boolean isS2PresentInS1 = false;
			for(int j=0;j<s2.length();j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					isS2PresentInS1 = true;
				}
			}
			
			if(isS1PresentInS2==false||isS2PresentInS1==false)
			{
				isAllCharPresent=false;
				break;
			}
		}
		if(isAllCharPresent&&s1.length()==s2.length())
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
}
