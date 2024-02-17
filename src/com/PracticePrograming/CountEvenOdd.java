package com.PracticePrograming;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		int n=2345678;
		
		int even=0;
		int odd=0;
		while(n!=0)
		{
			int remainder=n%10;
			
			if(remainder%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
				n=n/10;
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
