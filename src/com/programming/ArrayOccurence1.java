package com.programming;

import java.util.Scanner;

public class ArrayOccurence1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[]=new int[size];
		
		//logic to add array elements
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("Enter the number to check how many times it has been repeated: ");
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.println(num+" has been repeated "+count+" times ");
	}
}
