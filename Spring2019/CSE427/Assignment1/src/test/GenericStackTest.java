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
 * @param <T>
 *
 */
public class GenericStackTest<T> {
	 private GenericStack<T> genericStack;
	
	 
	 
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
		
		genericStack.push((T) "100");
		genericStack.pop(); //popping items from empty stack
		
		assertEquals(genericStack.size(), 0); //expecting null when stack is empty
		
	}
	
	@Test
	public void testIsEmptyOnEmptyStack() {
		boolean output = genericStack.isEmpty(); //returning value whether the stack is empty or not
		
		assertEquals(output, true); //expecting true when stack is empty
	}
	
	@Test
	public void testIsEmptyOnNonEmptyStack() {
		boolean output = genericStack.isEmpty(); //returning value whether the stack is empty or not
		
		assertEquals(output, true); //expecting true when stack is empty
	}
	
	@Test
	public void testOnSimplePush() {
		genericStack.push((T) "10");
		
		boolean output = genericStack.isEmpty(); //expecting false value on output variable
		
		assertEquals(output, false); //comparing the output value if it is false as single push is done into the stack
	}
	
	
	@Test
	public void testOnStackSize1() {
		genericStack.push((T) "Here is a push"); //pushing a single item into stack
		
		int size = genericStack.size();
		
		assertEquals(size, 1);
	}
	
//	the following method tests whether the stacksize equals 3 after pushing 3 items into the stack
	
	@Test
	public void testOnStackSize3() {
		genericStack.push((T) "push1");
		genericStack.push((T) "push2");
		genericStack.push((T) "push3");
		
		int size = genericStack.size();
		assertEquals(size, 3); //expecting 3 as 3 items have been pushed
	}
	
	@Test
	public void testOnPop() {
		genericStack.push((T) "pushing for pop");
		genericStack.push((T) "push 2 for pop");
		genericStack.pop(); //popping 1 item from the stack
		
		int size = genericStack.size(); //should return the stack size as 1
		
		assertEquals(size, 1); //comparing the stacksize after popping
	}
	
	@Test
	/* This will check whether the stack is empty 
	 * after popping the only item from the stack
	 */
	public void testIsEmptyAfterPopping() {
		genericStack.push((T) "here is a puish");
		genericStack.pop();
		
		boolean output = genericStack.isEmpty();
		
		assertEquals(output, true);
	}
	
	/*
	 * The Following testcase will check the isEmpty() method 
	 * after popping 1 item from the stack
	 */
	@Test
	public void testIsEmptyAfterPoppingElements() {
		genericStack.push((T) "Kazi");
		genericStack.push((T) "Sakib");
		
		genericStack.pop();
		
		boolean output = genericStack.isEmpty();
		
		assertEquals(output, false);
		
	}
	
	/*
	 * the following method will check the most recent 
	 * pushed item into the stack
	 */
	@Test
	public void testTheTopItemAfterPushing() {
		genericStack.push((T) "1");
		
		assertEquals("1", genericStack.topItem());
	}
	
	/*
	 * the following method will check the most recent 
	 * pushed item into the stack
	 */
	
	@Test
	public void testTheTopElementAsString() {
		genericStack.push((T) "My");
		genericStack.push((T) "Name");
		
		genericStack.push((T) "23");
		
		assertEquals("23", genericStack.topItem());
		
	}
	
	
	/*The following method will check the top element
	 * on a empty stack
	 */
	@Test
	public void testTheTopElementOnEmptyStack() {
		
		assertEquals(null, genericStack.topItem()); //expecting null value as there is no item
		
	}
	
	
	
	
	
	
	
	

}
