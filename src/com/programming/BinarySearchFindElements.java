package com.programming;

import java.util.Arrays;

public class BinarySearchFindElements {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};	//Elements should be in sorted order
		
		int key=40;
		int mid=0;
		int l=0,h=arr.length-1;
		
		while(l<=h)
		{
			 mid=(h+l)/2;
			 
			if(arr[mid]==key)
			{
				System.out.println("it is Present");
				break;
			}
			if(key>arr[mid])
			{
				l=mid+1;
			}
			if(key<arr[mid])
			{
				l=mid-1;
			} 
		}
		System.out.println(mid);
		
			System.out.println("element is not present");
			
//Approach 2 ---By using BinarySearch method which is present in Arrays class
		//	System.out.println(Arrays.binarySearch(arr, 50));
		
	}
}
