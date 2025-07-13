package com.interviewprep.array;

//works for unique and duplicate elements - 1st remove duplicates i.e prepare unique element array 
public class NthLargestWithDuplicates {
	public static void main(String[] args) {
		int [] a = {2,5,4,8,6,9,9,9};
		int N =3;
		
		int [] unique = new int[a.length];
		int index = 0;
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
			//if count is ==1  then it is unique - add it to unique array
			if(isPreviouslyPresent==false&&count==1)
			{
				unique[index++] = a[i]; // add in index and increment index (post increment)
			}
		}
		
		//Now, find Nth Largest in Unique Elements Array : NOTE -> iterate till unique array index only
		for(int i=0;i<index;i++)
		{
			int count =0;
			for(int j=0;j<index;j++)
			{
				if(a[i]<a[j])
				{
					count++;
				}
			}
			if(count==(N-1))
			{
				System.out.println("Nth largest : "+a[i]);
			}
		}
	}

}
