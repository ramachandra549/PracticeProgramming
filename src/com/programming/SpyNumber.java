package com.programming;

import java.util.Scanner;

public class SpyNumber {
	
	/*
	 * if the sum and product of the given number is Same then it is a Spy number
	 * EX:
	 * 6
	 * sum=1+2+3=6
	 *  product=1*2*3=6
	 *  (sum==product)	then it is a Spy number......
	 *   
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Spy number or not");
		int num=sc.nextInt();
		int sum=0,product=1;
		int last=0;
			while(num>0)
			{
				last=num%10;
				sum=sum+last;
				product=product*last;
				num=num/10;
			}
			if(sum==product)
			{
				System.out.println("it is a spy number");
			}
			else
				System.out.println("not a spy number");
		
	}

}
