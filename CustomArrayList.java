package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	
	

	public boolean add(T item) {
	   
		// Print the elements if the array is not full
//	    if (size < items.length) {
//	       
//	        for (int i = 0; i < size; i++) {
//	            System.out.println(items[i]);
//	        }
//	    }
	    // Check if array is full 
	    if (getSize() == items.length) {
	        // Double the size of the array
	        items = Arrays.copyOf(items, items.length * 2);
	    }
	    
	    // Add the new item to the array
	    items[size] = item;
	    
	    // Increment the size
	    size++;
	    
	   
	    
	    return true;
	}
	
	public int getSize() {
		// TODO Auto-generated method stub
		int size = items.length;
		return size;
	}


	public T get(int index) {
		//Check if index is within bounds
		if(index < 0 || index >= getSize()) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		//Return the element at the specified index
		@SuppressWarnings("unchecked")
		T item = (T) items[index];
		return item;
	}
	
}
