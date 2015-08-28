package br.com.oca.module1;

/**
 * 
 * @author Joabe Lucena
 * @see http://theurbanpenguin.com/wp/index.php/building-classes-in-java-7-with-constructors-and-fields/
 * 
 * @version 1.2 Define the structure of a Java class
 * 
 * Theory:
 * 
 * Here is the definition of a Java Class
 * 
 * [package];
 * 
 * [import];
 * 
 * [modifier] class ClassName [extends SuperClass] [implements Interface] {
 * 
 * [fields];
 * 
 * [constructors];
 * 
 * [methods];
 * }
 * 
 * So we have an example in this code
 *
 */
public class MyClass {
	
	//Those are class's fields
	private int field1;
	private String field2;
	
	//This is class's constructor
	public MyClass(){
		super();
	}

	//Getters n Setters methods
	public int getField1() {
		return field1;
	}

	public void setField1(int field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}
	
	//A method =S...
	public void MyCustomMethod(){
		System.out.println("Hello World!");
	}	
	

}
