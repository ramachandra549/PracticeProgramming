package com.programming;

import java.util.Scanner;

public class CountOfWords {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String words to count");
//		String s=sc.nextLine();
		String s="Rama chandra a nayak";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') &&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words :"+count);
		
	}
}
