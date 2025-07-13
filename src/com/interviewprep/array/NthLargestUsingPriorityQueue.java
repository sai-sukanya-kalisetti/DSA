package com.interviewprep.array;

import java.util.PriorityQueue;

//works for unique elements
public class NthLargestUsingPriorityQueue {
	public static void main(String[] args) {
		int [] a = {2,5,4,8,6,9};
		int N =3;
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int k : a)
		{
			queue.offer(k);
			
			if(queue.size()>N)
			{
				queue.poll();
			}
		}
		
		System.out.println("Nth Largest : "+queue.peek());
				
	}
}
