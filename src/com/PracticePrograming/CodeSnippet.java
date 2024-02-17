package com.PracticePrograming;

public class CodeSnippet {

	static int x;
	public static void main(String[] args) {
		CodeSnippet c=new CodeSnippet();
		c.x=10;
		CodeSnippet c1=new CodeSnippet();
		c1.x=20;
		
		x=30;
		System.out.println(c.x);
		System.out.println(c1.x);
		
	}
}
