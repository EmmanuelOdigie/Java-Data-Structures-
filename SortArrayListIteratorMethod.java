package JavaArrayList; // project created in eclipse
import java.util.ArrayList;// imported ArrayList class
import java.util.Collections;// imported collections class
import java.util.Iterator; // imported iterator class

public class SortArrayListInteratorMethod { // created public class SortArrayList

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

// Used Iterator to loop the names of cars, created an object of the Iterator imported class
// object named 'carList'
	Iterator<String> carList = myCarCollctionObj.iterator();

// while loop made that takes the object created and calls onto the '.hasNext()' function
// this checks if there's string text available for the loop
// if it does have more string(txt) values it will display each of the names in a loop
	while(carList.hasNext()) {
		System.out.println(carList.next());
	}
		

	}

}