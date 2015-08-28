package br.com.oca.module1;

import br.com.oca.module2.ObjectLife;
/**
 * 
 * @author Joabe Lucena
 * 
 * @version 1.4 Import other Java packages to make them accessible in your code
 * 
 * Importing an out package class...
 * 
 */

public class ImportClass {

	public static void main(String[] args){
		ObjectLife of = new ObjectLife();
		
		System.out.println("Calculating area from out package class: " + of.area(5, 25) + "m2.");
		
	}

}
