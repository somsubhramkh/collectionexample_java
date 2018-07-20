package com.niit.collectionsexample.api;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class Stack<T> {

	protected LinkedList stack;
	
	public Stack() {
		this.stack=new LinkedList();
	}
	
	public abstract void push(T item);
	
	
	public void pop() {
		
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		stack.removeLast();
		
	}

	public void iterate() {
		Iterator iterator=stack.descendingIterator();
		
		System.out.println("===========================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	
	
	}
}
