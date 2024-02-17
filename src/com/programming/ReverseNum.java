package com.programming;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
//Way-1:
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to reverse");
		int num=sc.nextInt();
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse number is "+rev);
	*/
		
//Way-2: StringBuffer Method
	/*	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to reverse");
		int num=sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse number is "+rev);
	*/	
		
//Way-3: StringBuilder Method
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to reverse");
		int num=sc.nextInt();
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse number is "+rev);
		
		
		
	}
}
