/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import codes.GenericStack;

/**
 * @author user
 *
 */
public class GenericStackTest {
	 private GenericStack<String> genericStack;
	 
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		genericStack = new GenericStack();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testPopOnEmptyStack() {
		
		
		String output = genericStack.pop(); //popping items from empty stack
		
		assertEquals(output, null); //expecting null when stack is empty
		
	}
	
	@Test
	public void testIsEmptyOnEmptyStack() {
		boolean output = genericStack.isEmpty(); //returning value whether the stack is empty or not
		
		assertEquals(output, true); //expecting true when stack is empty
	}
	
	@Test
	public void testIsEmptyOnNonEmptyStack() {
		boolean output = genericStack.isEmpty(); //returning value whether the stack is empty or not
		
		assertEquals(output, false); //expecting true when stack is empty
	}
	
	@Test
	public void testOnSimplePush() {
		genericStack.push("10");
		
		boolean output = genericStack.isEmpty(); //expecting false value on output variable
		
		assertEquals(output, false); //comparing the output value if it is false as single push is done into the stack
	}
	
	
	@Test
	public void testOnStackSize1() {
		genericStack.push("Here is a push"); //pushing a single item into stack
		
		int size = genericStack.size();
		
		assertEquals(size, 1);
	}
	
//	the following method tests whether the stacksize equals 3 after pushing 3 items into the stack
	
	@Test
	public void testOnStackSize3() {
		genericStack.push("push1");
		genericStack.push("push2");
		genericStack.push("push3");
		
		int size = genericStack.size();
		assertEquals(size, 3); //expecting 3 as 3 items have been pushed
	}
	
	
	
	
	

}
