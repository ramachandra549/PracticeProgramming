package com.PracticePrograming;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="Rama";
		String rev="";
		String org=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
