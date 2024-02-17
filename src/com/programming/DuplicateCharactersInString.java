package com.programming;

public class DuplicateCharactersInString {

	public static void main(String[]args) {

		String s="Ramachandraaaa";

		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{

			char ch=s.charAt(i);
		int index=s.indexOf(ch,+1);
		if(index==-1)
		{
		sb.append(ch);

		}
		
		}
		System.out.print(sb);
		
		}
}
