package soloLearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Integer> ages = new HashMap<String, Integer>();
			ages.put("David", 22);
			ages.put("Tom", 23);
			ages.put("Robert", 32);
			ages.put("Alice", 21);
			ages.put("Sophie", 19);
			ages.put("Maria", 24);
			ages.put("John", 28);

			String[] nameArr = new String[ages.size()];
			nameArr = ages.keySet().toArray(nameArr);

			int ageLimit = sc.nextInt();

			for (String emp : nameArr) {
				int x = ages.get(emp);
				if (x < ageLimit) {
					ages.remove(emp);
				}
				// your code goes here

			}

			System.out.println(ages);
		}

//		  HashMap<String, Integer> points = new HashMap<String, Integer>();
//	        points.put("Amy", 154);
//	        points.put("Dave", 42);
//	        points.put("Rob", 733);
//	        System.out.println(points.get("Dave")); 
//	    Scanner sc = new Scanner(System.in);
//        
//        
//        LinkedList<String> words = new LinkedList<String>();
//        
//        
//        while(words.size()<5){
//            String word = sc.nextLine();
//            //add the word to LinkedList
//            words.add(word);
//        }
//        for(String w: words){
//            if(w.length()> 4){
//                System.out.println(w);
//                   
//            }
//        
//		
//		LinkedList<String> c = new LinkedList<String>();
//        c.add("Red");
//        c.add("Blue");
//        c.add("Green");
//        c.add("Orange");
//        c.remove("Green");
//        System.out.println(c);
//		
//        for(String s: c) {
//            System.out.println(s);
//        }

//		
//		ArrayList colors1 = new ArrayList();
//		ArrayList<String> colors = new ArrayList<String>(10);
//		colors.add("green");
//		colors1.add(2);
//		colors1.add("green");
//		colors.add("blue");
//		boolean cont = colors.contains("blue");
//		int s = colors.size();
//		String ind = colors.get(1);
//		System.out.println(cont + " " + ind + " " + s );
//		colors.clear();
//		System.out.println(colors.size());
//		

//		try {
//	        int value = 7;
//	        value = value / 0;
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			
//		}
	}
}
