package com.programming;

import java.util.Arrays;

public class AnagramDemo1 {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();		
		if(ch1.length !=ch2.length)
		{
			System.out.println("Not Anagram");
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i] != ch2[i])
				{
					System.out.println("Not Anagram");
				}		
			}
		
	}
}
