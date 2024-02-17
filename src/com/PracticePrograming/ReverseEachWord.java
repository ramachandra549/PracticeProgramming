package com.PracticePrograming;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str="Rama chandra nayak";
		String[] words=str.split(" ");
		String rev="";
		
		for(String w:words)
		{
			String word="";
			for(int i=w.length()-1;i>=0;i--)
			{
				word=word+w.charAt(i);
			}
			rev=rev+word+" ";
		}
		System.out.println(rev);
		
		
		
	}	
	
}
