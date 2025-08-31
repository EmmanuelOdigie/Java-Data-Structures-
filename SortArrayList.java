package JavaArrayList; // project created in eclipse
import java.util.ArrayList;// imported ArrayList class
import java.util.Collections;// imported collections class
import java.util.Iterator; // imported iterator class

public class SortArrayList { // created public class SortArrayList

	public static void main(String[] args) { // reads,runs&executes
	// created object of the imported ArrayList class named 'myCarCollctionObj'
		ArrayList<String> myCarCollctionObj = new ArrayList<String>();
	//Display text	
		System.out.println("My car collection in alphabetical order: ");
	//used object to call onto the '.add' function to store the txt name of carsin the object	
		myCarCollctionObj.add("Volvo");
		myCarCollctionObj.add("Mazda");
		myCarCollctionObj.add("Cetreon");
		myCarCollctionObj.add("Fiat");
		myCarCollctionObj.add("Lada");
		myCarCollctionObj.add("Toyota");
	// used the imported collections class, this stores the text in as a collection in that class
	// it works with '.sort' function, when typed 'collection.sort' it takes the collection of car names
	// and sort them out alphabetically
		Collections.sort(myCarCollctionObj);

	// for loop was placed, set int car = 0 
	// '.size' gets the amount of cars, 'myCarCollectionObj.size()' gets the amount of cars in the object
	//	car is less than the amount of car names in object 'myCarCollectionObj' 
	// it increments by 1
	// display the name of cars in the object during the loop
	for(int car = 0; car<myCarCollctionObj.size(); car=car+1) {
		System.out.println(myCarCollctionObj.get(car));
	}
		

	}

}