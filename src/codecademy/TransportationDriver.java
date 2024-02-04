package codecademy;

import java.io.*;
import java.util.Scanner;

public class TransportationDriver {
	public static void main(String[] args) {
		TransportBike bicycle = new TransportBike();
		TransportCar car = new TransportCar();
		String filePath = "argfile";

//		try {
//			FileReader myFile = new FileReader(filePath);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner input = new Scanner(System.in);
    String person1 = input.next();
    String person2 = input.next();
		bicycle.wheels();
		car.wheels();
    System.out.println(person1 + " and " + person2 + " want to purchase a bike.");
    System.out.println(person2 + " wants to purchase a car.");

	
}
}

