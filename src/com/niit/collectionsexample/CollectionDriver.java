package com.niit.collectionsexample;

import com.niit.collectionsexample.api.impl.StackImplInt;

public class CollectionDriver {
	
	public static void main(String[] args) {
		
		StackImplInt stack=new StackImplInt();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.iterate();
		
		stack.pop();
		stack.pop();
		
		stack.iterate();
		
		
		
		
	}

}
