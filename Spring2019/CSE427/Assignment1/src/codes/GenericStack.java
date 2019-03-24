package codes;

import java.util.ArrayList;

public class GenericStack <T> {

	private ArrayList<T> stack = new ArrayList<T> ();
	
	private int top = 0;
	
	//implemented this method after testing on pushing 1 and 3 elements 
	public int size() {
		return top;
	}
	
	
	public GenericStack() {
		
	}
	
	//working method body added after testing with testOnSimplePush() method  
	public void push(T item) {
		
		stack.add(top++, item);
		
	}
	
	
	public T pop() {
		
		return null;
		
	}
	
//	isEmpty method implemented after testing it on Empty and non-Empty stack
	public boolean isEmpty(){
		if(top==0) {
			return true;
	
		}
		else {
			return false;
		}
	
	}
	
	
	
	
}
