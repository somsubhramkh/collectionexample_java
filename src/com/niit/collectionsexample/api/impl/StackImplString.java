package com.niit.collectionsexample.api.impl;

import java.util.Iterator;
import java.util.LinkedList;

import com.niit.collectionsexample.api.Stack;

public class StackImplString extends Stack<String>{

	@Override
	public void push(String item) {
		
		stack.addLast(item);
	
	}	
	
}
