package com.niit.collectionsexample.api.impl;

import java.util.Iterator;
import java.util.LinkedList;

import com.niit.collectionsexample.api.Stack;

public class StackImplString implements Stack{

	private LinkedList stack;
	
	public StackImplString() {
		this.stack=new LinkedList();
	}
	
	@Override
	public void push(Object item) {
		
		stack.addLast(item);
		
	}

	@Override
	public void pop() {
		
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		stack.removeLast();
		
	}

	@Override
	public void iterate() {
		Iterator iterator=stack.descendingIterator();
		
		System.out.println("===========================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}

	
	
}
