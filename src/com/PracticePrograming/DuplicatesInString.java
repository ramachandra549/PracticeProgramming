package com.PracticePrograming;

public class DuplicatesInString {

	public static void main(String[] args) {
		String str="Automation";
		
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicates array :"+ch[i]);
					count++;
				}
			}
		}
	}
}
