package JavaArrayList; //project created in eclipse
import java.util.ArrayList;// imported ArrayList class
import java.util.Collections;// imported collections class

public class SortArrayListInteger {// created public class SortArrayListInteger

	public static void main(String[] args) {//reads runs & executes code
		//Created object of te imported ArrayList class called 'myNumberList'
		ArrayList<Integer> myNumberList = new ArrayList<Integer>();
	//Displayed text, was ment to display numbers added 	
	System.out.println("My list of numbers to be organised " + myNumberList);
	// the object 'myNumberList' calls on the add function and stores the number in the object 
		myNumberList.add(12);
		myNumberList.add(10);
		myNumberList.add(78);
		myNumberList.add(35);
		myNumberList.add(49);
		myNumberList.add(92);
// imported collections class to store all the numbers in the class from object created and sort out
// numerically from low to high
		Collections.sort(myNumberList);
// Display text	
	System.out.println("Numbers Organised ");
// int num takes the value from object and displays it organised
		for(int num: myNumberList) {
			System.out.println(num);
		}
		
		

	}

}
// result: My list of numbers to be organised []
//Numbers Organised 
//10
//12
//35
//49
//78
//92