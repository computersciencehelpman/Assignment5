package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ExampleApplication {

	public static void main(String[] args) {
		CustomArrayList<String> customList = new CustomArrayList<>();
		List<String> numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		numbers.add("7");
		numbers.add("8");
		numbers.add("9");
		numbers.add("10");
		numbers.add("11");
		numbers.add("13");
		
		//Example: Print the elements in customList
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
	}
	
}
