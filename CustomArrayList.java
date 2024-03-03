package com.coderscampus.arraylist;

import java.util.ArrayList;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	
	

	public boolean add(T item) {
		// TODO Auto-generated method stub
		//double size once array is full
		if(getSize() == items.length) {
			System.out.println("List is full");
			
			//Create a new array with double the size
			Object[] moreItems = new Object[items.length *2];
			
			//Copy elements from the old array to the new one
			System.arraycopy(items, 0, moreItems, 0, items.length);
			
			//Assign the new array to the items reference
			items = moreItems;
		}
		
		//Add the new item to the array
		items[getSize()] = items;
		
		//Increment the size
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
