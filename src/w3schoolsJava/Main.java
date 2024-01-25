package w3schoolsJava;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Suzuki");
		System.out.println("different methods for ArrayList");
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.size());
		cars.set(0, "Pontiac");
		System.out.println(cars.get(0));


		// import Collections to sort an ArrayList
		Collections.sort(cars);
		System.out.println(cars);
		System.out.println("cars in for loop");
		for(int i = 0; i <cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("cars in for each loop");
		for( String i: cars) {
			System.out.println(i);
		}
		
		
	}
}
