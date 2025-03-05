package com.programs.linearSearch;

public class SearchingInString {
	public static void main(String[] args) {
		String s = "kunal";
		char target = 'a';
		int resultIndex = linearSearch1(s,target);
		System.out.println(resultIndex);
	}
	
	//returning index
	static int linearSearch1(String s, int target) {
		if(s.length()==0)
		{
			return -1;
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==target)
			{
				return i;
			}
		}
		return -1;
	}
	
	//returning boolean
		static boolean linearSearch2(String s, int target) {
			if(s.length()==0)
			{
				return false;
			}
			for(char ch : s.toCharArray())
			{
				if(ch==target)
				{
					return true;
				}
			}
			return false;
		}
}
