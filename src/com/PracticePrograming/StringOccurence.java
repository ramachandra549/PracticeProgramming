package com.PracticePrograming;

public class StringOccurence {

	public static void main(String[] args) {
		//input - a2b3c4
		//output - aabbbcccc
		
		String str="a2b3c4";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else {
				int x=Character.getNumericValue(str.charAt(i));
				for(int j=1;j<x;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
}
