package com.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArray2ArrayList {

	public static void main(String[] args) {

//Approach 		
		String arr[]= {"Red","Green","Yellow","White","Blue","Pink"};
	/*	List list=Arrays.asList(arr);
		System.out.println(list);
	*/	
//Approach 2
		
	/*	List list=new ArrayList();
		Collections.addAll(list, arr);
		System.out.println(list);
	*/	
//Approach 3
		List l=new ArrayList();
		for(String list:arr)
		{
			l.add(list);
		}
		System.out.println(l);
	}
}
