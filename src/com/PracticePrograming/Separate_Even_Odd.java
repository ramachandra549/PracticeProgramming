package com.PracticePrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Separate_Even_Odd {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13);
//	
	list.stream().sorted().limit(2).forEach(System.out::println);
	list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
//	st.forEach(t-> System.out.print(t));
	
	}
}
