package com.PracticePrograming;

public class Max_Min_Array {

	public static void main(String[] args) {
		 int a[]= {30,40,10,20,70,80,55};
		 	int max=a[0],min=a[0];
		 	
		 	for(int i=0;i<a.length;i++)
		 	{
		 		if(a[i]>max)
		 		{
		 			max=a[i];
		 		}
		 		else if(a[i]<min)
		 		{
		 			min=a[i];
		 		}
		 	}
		 	System.out.println(min);
		 	System.out.println(max);
		 	
		 	
	}
}
