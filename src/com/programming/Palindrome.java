package com.programming;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(rev==org_num)
		{
			System.out.println(rev+" : its a palindrome number");
		}
		else
		{
			System.out.println(rev+" : it is Not  Palindrome");
		}
	}

}
