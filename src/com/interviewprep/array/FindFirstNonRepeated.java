package com.interviewprep.array;

public class FindFirstNonRepeated {
	public static void main(String[] args) {
		int [] a = {2,4,2,5,3,2,1,2,2,2,4,8,6,9};
		
		//check count of occurrence print accordingly
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			boolean isPreviouslyPresent = false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isPreviouslyPresent = true;
					break;
				}
			}
			//if count is 1  then it is unique - print 1 and break
			if(isPreviouslyPresent==false&&count==1)
			{
				System.out.println(a[i]+" occurred "+count+" time/s");
				break;
			}
		}
	}

}
