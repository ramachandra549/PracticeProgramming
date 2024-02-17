package com.programming;

import java.util.Scanner;

public class StringOccurenceChar {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		
		System.out.println("Enter the char");
		char ch=sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(ch==c)
			{
				count++;
			}
			
		}
		System.out.println("count is :"+count);
	}
}
