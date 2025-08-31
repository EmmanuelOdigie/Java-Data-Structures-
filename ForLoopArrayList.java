package JavaArrayList; // project created in eclipse

import java.util.ArrayList;// imported ArrayList class


public class ForLoopArrayList { // created public ForLoopArrayList

	public static void main(String[] args) { // reads, runs & executes code
	// created object of imported class named 'myFoodListObj'
		ArrayList<String> myFoodListObj = new ArrayList<String>();
		
	// used the object to call onto the '.add' function to put in my text to store
		myFoodListObj.add("Rice");
		myFoodListObj.add("Kebab");
		myFoodListObj.add("Noodles");
		myFoodListObj.add("Chips");
		myFoodListObj.add("Chicken");
		
	// for loop created, created attribute food=0, looped it through the object, that stored my text
	// of food the '.size' looks for how many names of food i've added in the object
	// increments of 1
	// object calls on to the '.get' function. 
	// in the brackets is  the attribute I created for the loop named 'food'
	//this will display the name of the food within the loop
		for(int food = 0; food<myFoodListObj.size();food=food+1) {
			System.out.println(myFoodListObj.get(food));
			
		}

	}

}
