package com.programming;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {5,10,15,10,5,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
//ForEach Loop
		int sums=0;
		for(int num:a)
		{
			sums=sums+num;
		}
		System.out.println(sum);
		
		
		
		
		
		
	}
}
