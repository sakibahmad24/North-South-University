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
 * @author sakibahmad24
 * @param <Object>
 *
 */
public class GenericStackTest<Object> {
	 private GenericStack<Object> genericStack;
	
	 
	 
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
		
		genericStack.push(100);
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
		genericStack.push(10);
		
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
	
	@Test
	public void testOnPop() {
		genericStack.push("pushing for pop");
		genericStack.push("push 2 for pop");
		genericStack.pop(); //popping 1 item from the stack
		
		int size = genericStack.size(); //should return the stack size as 1
		
		assertEquals(size, 1); //comparing the stacksize after popping
	}
	
	@Test
	/* This will check whether the stack is empty 
	 * after popping the only item from the stack
	 */
	public void testIsEmptyAfterPopping() {
		genericStack.push("here is a push");
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
		genericStack.push("Kazi");
		genericStack.push("Sakib");
		
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
		genericStack.push(1);
		
		assertEquals(1, genericStack.topItem());
	}
	
	/*
	 * the following method will check the most recent 
	 * pushed item into the stack
	 */
	
	@Test
	public void testTheTopElementAsString() {
		genericStack.push("My");
		genericStack.push("Name");
		
		genericStack.push(23);
		
		assertEquals(23, genericStack.topItem());
		
	}
	
	
	/*The following method will check the top element
	 * on a empty stack
	 */
	@Test
	public void testTheTopElementOnEmptyStack() {
		
		assertEquals(null, genericStack.topItem()); //expecting null value as there is no item
		
	}
	
	/*following testcases are for
	 * input space partition test
	 * for single character
	 */
	@Test
	public void testFailForSingleChar() {
		genericStack.push('a');
		genericStack.push('b');
		genericStack.push('c');
		
		assertEquals('d', genericStack.topItem()); //this test will fail
	}
	
	@Test
	public void testPassForSingleChar() {
		genericStack.push('a');
		genericStack.push('b');
		genericStack.push('c');
		
		assertEquals('c', genericStack.topItem()); //this test will pass
	}
	
	/* input space partition testcase for string variables */
	
	@Test
	public void testForStrings() {
		genericStack.push("Dabbe");
		genericStack.push("Siccin");
		genericStack.push("Anabelle");
		
		genericStack.pop();
		
		assertEquals("Siccin", genericStack.topItem());
	}
	
	/*
	 * input space partition testcase for positive integers
	 */
	
	@Test
	public void testForpositiveInteger() {
		genericStack.push(10);
		genericStack.push(100006);
		genericStack.push(12);
		
		assertEquals(12, genericStack.topItem());
	}
	
	/*
	 * input space partition testcase for negative integers
	 */
	
	@Test
	public void testForNegativeInteger() {
		genericStack.push(-152);
		genericStack.push(-65);
		
		assertEquals(-65, genericStack.topItem());
	}
	
	/*
	 * input space partition testcase for positive floats
	 */
	
	@Test
	public void testForPositiveFloats() {
		genericStack.push(6.333);
		genericStack.push(3.2);
		genericStack.push(102.66);
		
		genericStack.pop();
		genericStack.pop();
		
		assertEquals(6.333, genericStack.topItem());
	}
	
	/*
	 * input space partition testcase for negative floats
	 */
	
	@Test
	public void testForNegativeFloats() {
		genericStack.push(-602.33);
		genericStack.push(-10025.6);
		
		
		assertEquals(-10025.6, genericStack.topItem());
	}
	
	/*
	 * input space partition testcase for mix data types
	 */
	@Test
	public void testForMixDataTypes() {
		genericStack.push("Kazi Sakib");
		genericStack.push("Ahmad");
		genericStack.push(23);
		genericStack.push(-63.5);
		genericStack.push("student");
		
		for(int i = 0; i<2; i++) {
			genericStack.pop();
		}
		
		assertEquals(23, genericStack.topItem());
	}
	

}
