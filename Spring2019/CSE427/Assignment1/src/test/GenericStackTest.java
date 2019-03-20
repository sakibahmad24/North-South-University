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
	

}
