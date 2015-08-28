package br.com.oca.module2;

/**
 * 
 * @author Joabe Lucena
 * 
 * @see http://theurbanpenguin.com/wp/index.php/java-object-lifecycle-de-referencing-and-garbage-collection/
 * 
 * @version 2.4 Explain an Object's Lifecycle (creation, "dereference by reassignment" and garbage collection)
 * 
 * Object's LifeCycle is about when it's available in the code. It occurs inside the braces {} and before it gets null value.
 * 
 * The Java Garbage Collector (JGC) is part of the JVM, java virtual machine, and will return memory that is no longer used by 
 * variables back to the heap. It runs as a background process and under most circumstances this can be left to manage itself.
 * The JGC process is complex but generally works well self-managed.
 * 
 */
public class ObjectLife {
	public int area(int l, int w){
		return l * w;
	}
}

class Client{
	public static void main(String[] args){
		ObjectLife of = new ObjectLife();
		int area = of.area(3,5);
		System.out.println("The area of the object is: "+area);
		
		/* dereference of the object, it means that the this variable is not longer available and it means also
		 * that it is available for the JGC clean-it-up from memory.
		 */
		of = null; 
	}		
}
