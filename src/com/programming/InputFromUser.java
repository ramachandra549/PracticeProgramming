package com.programming;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("It is Even Number");
		}
		else
		{
			System.out.println("Not an Even");
		}
		
		
	}	
}
