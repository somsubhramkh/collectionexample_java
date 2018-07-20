package com.niit.collectionsexample.api.impl;

import java.util.Iterator;
import java.util.LinkedList;

import com.niit.collectionsexample.api.Stack;

public class StackImplInt extends Stack<Integer>{

	
	@Override
	public void push(Integer item) {
		
		stack.addLast(item);
		
	}

	
}
