package com.programming;

import java.util.Scanner;

public class PrimeNumberRange {

	/*
	 * The number which has only two factors 1 and itself,
	 * 7=1,7
	 * 13=1,13
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range to print prime Numbers :");
		int n2=sc.nextInt();
		int count;
		for(int j=1;j<=n2;j++)
		{
			count=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			
				System.out.print(" "+j);
			}
//			else
//				System.out.println("not");
		}
		
	}
}
