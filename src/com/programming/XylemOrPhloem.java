package com.programming;
public class XylemOrPhloem {
	/*
	 * if the sum of the Extreme digits(1st and Last) is Equal to the
	 *  sum of the mean digits(all digits except 1st and Last digits)
	 *  EX : 
	 *  34326 
	 *  Extreme =3+6=9;
	 *  mean = 4+3+2=9; 
	 *  (Extreme==mean)
	 *  so it is Xylem number
	 *  if it is not equal then it is a phloem number
	 */
	public static void main(String[] args) {
	
		int num=34326;
		int temp=num;
		int extreme=0,mean=0;
		while(temp!=0)
		{
			if(temp==num || temp<10)
				extreme=extreme+temp%10;
			else
				mean=mean+temp%10;
			temp=temp/10;
			
		}
		if(extreme==mean)
			System.out.println("it is xylem");
		else
			System.out.println("it is phloem");
	}
}
