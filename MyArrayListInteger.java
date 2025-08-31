package JavaArrayList; // project created in eclipse
import java.util.ArrayList; // imported ArrayList class

public class MyArrayListInteger {// created public MyArrayListInteger

	public static void main(String[] args) {// reads, runs & executes code
		
		// created object of imported class named 'myNumbersObj'
		ArrayList<Integer> myNumbersObj = new ArrayList<Integer>();
		
	// Display Text
		System.out.println("Numbers in 5's");
		
	// used the object to call onto the '.add' function to put in my numbers to store
		myNumbersObj.add(5);
		myNumbersObj.add(10);
		myNumbersObj.add(15);
		myNumbersObj.add(20);
		myNumbersObj.add(25);
		myNumbersObj.add(30);
	
	//	Display numbers from 'myNumbersObj' which the numbers are stored in
		System.out.println(myNumbersObj);
	
	//  created a for loop, made a variable 'num', set the attribute to 0
	// set variable 'num' less than the amount of number taken by the '.size()' function
	// increments by 1
	// the 'get(num)' function is used to get the number from the variable 'num' in the loop
	// that the number is originally stored in the object 'myNumbersObj'
		for(int num =0; num<myNumbersObj.size(); num=num+1) {
			System.out.println(myNumbersObj.get(num));
		}

	}

}