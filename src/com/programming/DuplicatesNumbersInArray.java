package com.programming;

public class DuplicatesNumbersInArray {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,2};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count==1)
				System.out.println(arr[i]);
				count=0;
			
		}
		
	}
}
