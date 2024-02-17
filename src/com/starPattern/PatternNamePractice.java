package com.starPattern;

public class PatternNamePractice {

	public static void main(String[] args) {
		

		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<=18;j++)
			{
			if(i==1||i==5||i==3||j==3||j==7||j==14)
			System.out.print("* ");
				else
					System.out.print("  ");
			}	
			System.out.println(); 	
		}
		
		
		
	}
}
