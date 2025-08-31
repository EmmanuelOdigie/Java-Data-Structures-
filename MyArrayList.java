// Java Data Structures: ArrayList //

package JavaDataStructures; // Project package

import java.util.ArrayList; // imported ArrayList class

public class MyArrayList { // created class MyArrayList

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // created an object 'cars' from imported ArrayList class
	// used object 'cars' to call onto the .add function to add the string names of cars
		cars.add("Volvo "); // added name 'volvo' in brackets with quotations " "
		cars.add("Mazda ");// added name 'mazda' in brackets with quotations marks " "
		cars.add("BMW ");// added name 'bmw' in brackets with quotations marks " "
		cars.add("Volkswagon ");// added name 'volkswagon' in brackets with quotations marks " "
		cars.add("Mercedese ");// added name 'mercedese' in brackets with quotations marks " "
		System.out.println(cars); // display names above stored in the 'cars' object
		

	}

}