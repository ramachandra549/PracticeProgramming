package com.PracticePrograming;

public class Leapyear {

	public static void main(String[] args) {
		
		int year=2024;
		if(year%400==0)
		{
			System.out.println("Its leap year");
		}
		else if(year%4==0  && year%100!=0)
		{
			System.out.println("its leap year");
		}
		else
		{
			System.out.println("Not leap");
		}
	}
}
