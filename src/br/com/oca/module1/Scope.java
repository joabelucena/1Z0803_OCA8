package br.com.oca.module1;

/**
 * @author Joabe Lucena
 * 
 * @see http://www.c4learn.com/java/java-variable-scope/
 * @see http://stackoverflow.com/questions/215497/in-java-whats-the-difference-between-public-default-protected-and-private
 * 
 * @version 1.1 Define the scope of variables (Ok) 
 *
 * Theory:
 * -------------------------------------------------------------------------
 * 
 * We can declare variables within any block.
 * 
 * Block is begun with an opening curly brace and ended by a closing curly brace.
 * 
 * 1 BLOCK equal to 1 new SCOPE in Java thus each time you start a new block, you are creating a new scope.
 * 
 * A scope determines what objects are visible to other parts of your program. It also determines the lifetime of those objects.
 * 
 * More Theo:
 * -------------------------------------------------------------------------
 * 
 * public final static String MY_CONSTANT = "SomeValue";
 * 
 * public		- Modifier that indicates that it's accessible from everywhere
 * final		- Indicates a constante value (can't be changed);
 * static		- Belongs to the class, no instance necessary to use it;
 * String		- DataType of the variable
 * MY_CONSTANT	- Variable's name
 * 
 * Modifiers:
 * -------------------------------------------------------------------------
 * 
 * Modifier    | Class | Package | Subclass | World
 * ————————————+———————+—————————+——————————+———————
 * public      |  y    |    y    |    y     |   y
 * ————————————+———————+—————————+——————————+———————
 * protected   |  y    |    y    |    y     |   n
 * ————————————+———————+—————————+——————————+———————
 * no modifier |  y    |    y    |    n     |   n    **also known as package-private**
 * ————————————+———————+—————————+——————————+———————
 * private     |  y    |    n    |    n     |   n
 * 
 * y: accessible
 * n: not accessible
 * 
 *   
 */
@SuppressWarnings("all")
public class Scope {

	public static void main(String args[]) {
		example1();
		example2();
		example3();		
	}
	
	/**
	 * @author Joabe Lucena
	 * Example 1 : Variable Scope in Java Programming 
	 */
	static void example1(){
		int n1; // Visible in main

		n1 = 10;

		if (n1 == 10) {
			// start new scope
			int n2 = 20; // visible only to this block

			// num1 and num2 both visible here.
			System.out.println("n1 and n2 : " + n1 + " " + n2);
		}
		//n2 = 100; // Error! y not known here

		// n1 is still visible here.
		System.out.println("n1 is " + n1);
	}
	
	/**
	 * @author Joabe Lucena
	 * Example 2 : How we get Compile Error 
	 */
	static void example2(){
		//Begin Scope A
		{
			int num = 1;
			
			//Begin Scope A1
			{
				//int num = 2; // Compile-time error num already defined
			}//End Scope A1
			
		}//End Scope A
		

		//Begin Scope B
	    {             
	      int num = 1;
	    }//End Scope B
	    
	    //Begin Scope C
	    {
	      int num = 2;
	    }//End Scope C
	}
	
	/**
	 * @author Joabe Lucena
	 * Example 3 : Re Initializing Same Variable again and again
	 */
	static void example3(){
		int i;

	    for(i = 0; i < 3; i++) {
	      int y = -1;
	      System.out.println("y is : " + y);
	    }
	}
	
}
