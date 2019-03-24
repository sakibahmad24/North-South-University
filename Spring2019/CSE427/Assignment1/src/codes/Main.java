/**
 * 
 */
package codes;

/**
 * @author sakibahmad24
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GenericStack stack = new GenericStack();
		

		/* added 2 push below and checked the stack size for verification */ 
		
		stack.push(100);
		stack.push("Sakib");
		
		System.out.println(stack.size());
		
		

	}

}
