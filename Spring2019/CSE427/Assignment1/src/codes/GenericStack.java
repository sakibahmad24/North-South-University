package codes;

import java.util.ArrayList;

public class GenericStack <T> {

	private ArrayList<Object> stack = new ArrayList<Object> ();
	
	private int top = 0;
	
	//implemented this method after testing on pushing 1 and 3 elements 
	public int size() {
		return top;
	}
	
	
	public GenericStack() {
		
	}
	
	//working method body added after testing with testOnSimplePush() method  
	public void push(Object item) {
		
		stack.add(top++, item);
		
	}
	
	
	//	testcase passed after implementing the pop method
	public Object pop() {
		
		return stack.remove (--top);
		
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
	
	
	/*implemented topItem method
	 * after testing it on various testcases
	 */
	public Object topItem() {
		if(!this.isEmpty()) {
			return pop();
		}
		else {
			return null;
		}
		
	}
	
	

	
	
}
