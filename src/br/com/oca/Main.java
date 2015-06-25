package br.com.oca;

import java.util.Scanner;

/**
 * @author Joabe Lucena This repository was created for studying to OCA SE8
 *         Exam.
 * 
 *         Here are the topics that will be studied in this 'course'
 * 
 *         1 Java Basics
 * 
 *         1.1 Define the scope of variables 1.2 Define the structure of a Java
 *         class 1.3 Create executable Java applications with a main method; run
 *         a Java program from the command line; including console output. 1.4
 *         Import other Java packages to make them accessible in your code 1.5
 *         Compare and contrast the features and components of Java such as:
 *         platform independence, object orientation, encapsulation, etc.
 * 
 *         2 Working With Java Data Types
 * 
 *         2.1 Declare and initialize variables (including casting of primitive
 *         data types) 2.2 Differentiate between object reference variables and
 *         primitive variables 2.3 Know how to read or write to object fields
 *         2.4 Explain an Object's Lifecycle (creation,
 *         "dereference by reassignment" and garbage collection) 2.5 Develop
 *         code that uses wrapper classes such as Boolean, Double, and Integer.
 *
 *         3 Using Operators and Decision Constructs
 * 
 *         3.1 Use Java operators; including parentheses to override operator
 *         precedence 3.2 Test equality between Strings and other objects using
 *         == and equals () 3.3 Create if and if/else and ternary constructs 3.4
 *         Use a switch statement
 * 
 *         4 Creating and Using Arrays
 * 
 *         4.1 Declare, instantiate, initialize and use a one-dimensional array
 *         4.2 Declare, instantiate, initialize and use multi-dimensional array
 * 
 *         5 Using Loop Constructs
 * 
 *         5.1 Create and use while loops 5.2 Create and use for loops including
 *         the enhanced for loop 5.3 Create and use do/while loops 5.4 Compare
 *         loop constructs 5.5 Use break and continue
 * 
 *         6 Working with Methods and Encapsulation
 * 
 *         6.1 Create methods with arguments and return values; including
 *         overloaded methods 6.2 Apply the static keyword to methods and fields
 *         6.3 Create and overload constructors; including impact on default
 *         constructors 6.4 Apply access modifiers 6.5 Apply encapsulation
 *         principles to a class 6.6 Determine the effect upon object references
 *         and primitive values when they are passed into methods that change
 *         the values
 * 
 *         7 Working with Inheritance
 * 
 *         7.1 Describe inheritance and its benefits 7.2 Develop code that
 *         demonstrates the use of polymorphism; including overriding and object
 *         type versus reference type 7.3 Determine when casting is necessary
 *         7.4 Use super and this to access objects and constructors 7.5 Use
 *         abstract classes and interfaces
 * 
 *         8 Handling Exceptions
 * 
 *         8.1 Differentiate among checked exceptions, unchecked exceptions, and
 *         Errors 8.2 Create a try-catch block and determine how exceptions
 *         alter normal program flow 8.3 Describe the advantages of Exception
 *         handling 8.4 Create and invoke a method that throws an exception 8.5
 *         "Recognize common exception classes (such as NullPointerException, ArithmeticExcpetion, ArrayIndexOutOfBoundsException, ClassCastException)"
 * 
 *         9 Working with Selected classes from the Java API
 * 
 *         9.1 Manipulate data using the StringBuilder class and its methods 9.2
 *         Creating and manipulating Strings 9.3 Create and manipulate calendar
 *         data using classes from java.time.LocalDateTime, java.time.LocalDate,
 *         java.time.LocalTime, java.time.format.DateTimeFormatter,
 *         java.time.Period 9.4 Declare and use an ArrayList of a given type 9.5
 *         Write a simple Lambda expression that consumes a Lambda Predicate
 *         expression
 */

public class Main {

	static Scanner entry = new Scanner(System.in);
	static int module;

	public static void main(String[] args) {
		System.out.println("Sumary: ");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1 Java Basics\n"
						+

						"	1.1 Define the scope of variables\n"
						+ "	1.2 Define the structure of a Java class\n"
						+ "	1.3 Create executable Java applications with a main method; run a Java program from the command line; including console output.\n"
						+ "	1.4 Import other Java packages to make them accessible in your code\n"
						+ "	1.5 Compare and contrast the features and components of Java such as: platform independence, object orientation, encapsulation, etc.\n"
						+ "\n"
						
						+ "2 Working With Java Data Types\n"
						+ "\n"

						+ "	2.1 Declare and initialize variables (including casting of primitive data types)\n"
						+ "	2.2 Differentiate between object reference variables and primitive variables\n"
						+ "	2.3 Know how to read or write to object fields\n"

						+ "	2.4 Explain an Object's Lifecycle (creation, \"dereference\" by reassignment and garbage collection)\n"
						+ "	2.5 Develop code that uses wrapper classes such as Boolean, Double, and Integer.\n"
						+ "\n"

						+ "3 Using Operators and Decision Constructs\n"
						+ "\n"

						+ "	3.1 Use Java operators; including parentheses to override operator precedence\n"
						+ "	3.2 Test equality between Strings and other objects using == and equals ()\n"
						+ "	3.3 Create if and if/else and ternary constructs\n"
						+ "	3.4 Use a switch statement\n"
						+ "\n"

						+ "4 Creating and Using Arrays\n"
						+ "\n"

						+ "	4.1 Declare, instantiate, initialize and use a one-dimensional array\n"
						+ "	4.2 Declare, instantiate, initialize and use multi-dimensional array\n"
						+ "\n"

						+ "5 Using Loop Constructs\n"
						+ "\n"

						+ "	5.1 Create and use while loops\n"
						+ "	5.2 Create and use for loops including the enhanced for loop\n"
						+ "	5.3 Create and use do/while loops\n"
						+ "	5.4 Compare loop constructs\n"
						+ "	5.5 Use break and continue\n"
						+ "\n"

						+ "6 Working with Methods and Encapsulation\n"
						+ "\n"

						+ "	6.1 Create methods with arguments and return values; including overloaded methods\n"
						+ "	6.2 Apply the static keyword  to methods and fields\n"
						+ "	6.3 Create and overload constructors; including impact on default constructors\n"
						+ "	6.4 Apply access modifiers\n"
						+ "	6.5 Apply encapsulation principles to a class\n"
						+ "	6.6 Determine the effect upon object references and primitive values when they are passed  into methods that change the values\n"
						+ "\n"

						+ "7 Working with Inheritance\n"
						+ "\n"

						+ "	7.1 Describe inheritance and its benefits\n"
						+ "	7.2 Develop code that demonstrates the use of polymorphism; including overriding and object type versus reference type\n"
						+ "	7.3 Determine when casting is necessary\n"
						+ "	7.4 Use super and this to access objects and constructors\n"
						+ "	7.5 Use abstract classes and interfaces\n"
						+ "\n"

						+ "8 Handling Exceptions\n"
						+ "\n"

						+ "	8.1 Differentiate among checked exceptions, unchecked exceptions, and Errors\n"
						+ "	8.2 Create a try-catch block and determine how exceptions alter normal program flow\n"
						+ "	8.3 Describe the advantages of Exception handling\n"
						+ "	8.4 Create and invoke a method that throws an exception\n"

						+ "	8.5 \"Recognize common exception classes (such as NullPointerException, ArithmeticExcpetion, ArrayIndexOutOfBoundsException, ClassCastException)\"\n"
						+ "\n"
						+ "9 Working with Selected classes from the Java API\n"
						+ "\n"
						+ "	9.1 Manipulate data using the StringBuilder class and its methods\n"
						+ "	9.2 Creating and manipulating Strings\n"
						+ "	9.3 Create and manipulate calendar data using classes from java.time.LocalDateTime,  java.time.LocalDate, java.time.LocalTime, java.time.format.DateTimeFormatter, java.time.Period\n"
						+ "	9.4 Declare and use an ArrayList of a given type\n"
						+ "	9.5 Write a simple Lambda expression that consumes a Lambda Predicate expression");
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		do{
			
			System.out.println("Choose a module (1-9): ");
			module = entry.nextInt();
			
		}while(module <1 || module > 9);

	}

}
