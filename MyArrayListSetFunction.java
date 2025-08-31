package JavaArrayList; // project created when setting up eclipse

import java.util.ArrayList; // imported ArrayList class

public class MyArrayListSetFunction {// created public class myArrayListSetFunction

	public static void main(String[] args) {
		
	// Created an object from the imported class 'ArrayList' named 'myList'
		ArrayList<String> myList = new ArrayList<String>();
	
	// used object 'myList' to call onto the '.add' function/method to add txt to the object
		myList.add("Volvo");
		myList.add("Lada");
		myList.add("Ford");
		myList.add("Nissan");
		myList.add("Mitzibushi");
	
	// Set Audi to be the first car to be displayed on the list
		myList.add(0, "Audi"); // in Java the number starts from 0 which is the 1'st number
		
		myList.set(0, "Kalos Daiwoo"); // using the '.set' function replaces the '.add' function
	// This instead display 'Kalos Daiwoo' not 'Audi'
		
		System.out.println(myList); // display the information in myList object
		

	}

}

// Result: [Kalos Daiwoo, Volvo, Lada, Ford, Nissan, Mitzibushi] 