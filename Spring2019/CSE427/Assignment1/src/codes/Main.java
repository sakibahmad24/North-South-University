/**
 * 
 */
package codes;

import sun.net.www.content.text.Generic;

/**
 * @author sakibahmad24
 *
 */
public class Main {

	/**
	 * @param <T>
	 * @param args
	 */
	public static <T> void main(String[] args) {
		
		GenericStack stack = new GenericStack();
		

		/* added 2 push below and checked the stack size for verification */ 
		
		stack.push(100);
		stack.push("Sakib");
		
		System.out.println(stack.size());
		
		
		System.out.println(stack.pop());
		

	}

}
