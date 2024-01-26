package w3schoolsJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// hash maps can hold different values ie <String, Integer>
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("US", "Washington");
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.get("England"));
	    System.out.println(capitalCities.keySet());
	    System.out.println(capitalCities.values());
	    
	    for (String i: capitalCities.keySet()) {
	    	System.out.println(i);
	    }
	    
	    for(String i: capitalCities.values()) {
	    	System.out.println(i);
	    }
	 // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
			
		
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("bananna");
		fruits.add("orange");
//		System.out.println(fruits);
		fruits.addFirst("chicken");
//		System.out.println(fruits);
//		System.out.println(fruits.getLast());
		Iterator<String> it = fruits.iterator();
		System.out.println(it.next());
		System.out.println(fruits);
		while(it.hasNext()) {
			String i = it.next();
			if(i == "bananna") {
				it.remove();
			}
				
			
		}
		System.out.println(fruits);
		
		
		ArrayList<String> cars = new ArrayList<String>();
		// adding cars to the ArrayList
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Suzuki");
//		System.out.println("different methods for ArrayList");
//		System.out.println(cars);
//		System.out.println(cars.get(0));
//		System.out.println(cars.size());
		cars.set(0, "Pontiac");
//		System.out.println(cars.get(0));


		// import Collections to sort an ArrayList
		Collections.sort(cars);
//		System.out.println(cars);
//		System.out.println("cars in for loop");
		for(int i = 0; i <cars.size(); i++) {
//			System.out.println(cars.get(i));
		}
//		System.out.println("cars in for each loop");
		for( String i: cars) {
//			System.out.println(i);
		}
		
		
	}
}
