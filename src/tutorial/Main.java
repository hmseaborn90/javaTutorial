package tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

//		OuterClass out = new OuterClass();
//		out.inner();
		LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        System.out.println(c);
		
        for(String s: c) {
            System.out.println(s);
        }
		
//		
//        String result = "";
//        for (int i = 2; i <= 3 / 2; ++i) {
//            /* condition for non prime number,
//               don't change condition*/
//            if (3 % i == 0){
//                result = "Isn't prime";
//                
//            }
//            else{
//                result = "Is prime";
//               
//            }   
//            
//        }
//        
//        System.out.println(result);
//		int x = 8;
//		while(x>0) {
//		  System.out.println(x);
//		  x-=3;
//		}
//        int fact = 1;
//        Scanner sc = new Scanner(System.in);
//        long input = sc.nextLong();
//        for(int i =1; i <= input; i++){
//            fact*=i;
//        }
//        System.out.println(fact);	
//	
//		int x = 0;
//		int y = 5;
//		while (x < y) {
//		  System.out.println("Hello" + x);
//		  x++; 
//		}
//		        
//
//
//public class Program {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int sum = 0;
//        while (input > 0){
//        sum += input;
//        input--;
//        }     
//        System.out.println(sum);  
//    }

//}
// public class Program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         int sum = 0;
//         int num =0;
//         while (num <= input){
//         sum += num;
//         num++;
//         }     
//         System.out.println(sum);  
//     }

// }

//		hi("hello", 5);

//		int[] x = {-22,2,4,5,6,1,3,0};
//		Arrays.sort(x, 1, 7);
//		for(int i:x) {
//			System.out.println(i + ",");
//		}
//		
//	    // Create a HashMap object called capitalCities
//	    HashMap<Character, Integer> m = new HashMap<Character, Integer>();
//	    String str = "Hello my name is harrison and java is cool";
//	    for(char x:str.toCharArray()) {
//	    	if (m.containsKey(x)){
//	    		int old = (int) m.get(x);
//	    		m.put(x, old+1);
//	    		
//	    	}else {
//	    		m.put(x, 1);
//	    	}
//	    	m.remove(' ');
//	    }
//	    System.out.println(m);
//	    // Add keys and values (Country, City)
//	    capitalCities.put("England", "London");
//	    capitalCities.put("Germany", "Berlin");
//	    capitalCities.put("Norway", "Oslo");
//	    capitalCities.put("USA", "Washington DC");
//	    System.out.println(capitalCities);
//		
//	    Map<String, String> m = new TreeMap<String, String>();
//	    m.put("England", "London");
//	    m.put("Germany", "Berlin");
//	    m.put("Norway", "Oslo");
//	    m.put("USA", "Washington DC");
//	    System.out.println(m);

//	ArrayList<Integer> t = new ArrayList<Integer>();
//	t.add(4);
//	t.add(4);
//	t.add(null);
//	t.set(2, 8);
//	System.out.println(t);
//		Set<Integer> t = new HashSet<Integer>();
//		t.add(5);
//		t.add(5);
//		t.add(9);
//		t.add(21);
//		
//		boolean x = t.contains(1);
//		System.out.println(x);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("type an number please");
//		int x = sc.nextInt();
//		
//		do {
//			System.out.println("type 10 please");
//			x = sc.nextInt();
//			
//		}while(x !=  10); 

//		int[] arr = {1,2,3,4,5};
//		String[] names = new String[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < names.length; i++) {
//			System.out.print("input: ");
//			String input = sc.nextLine();
//			names[i] = input;
//		}
//		for (String n:names) {
//			System.out.println(n);
//			if(n.equals("tim")) {
//				break;
//			}
//		}
//		int count = 0;
//		
//		for (int element:arr) {
//			System.out.println(element + " " + "at index" + " " +count);
//			count ++;
//			
//		}
		// TODO Auto-generated method stub
//		int x = 0;
//		int[] arr = {2,4,5,2,5,1};
//		int counter = 0;
//		for (int i = 0; i < arr.length; i ++) {
////			x -= 1;
////			System.out.println(x);
////			System.out.println(arr.length);
////			System.out.println(i);
//			
//			if (arr[i]== 5) {
//				
//				counter ++;
//				System.out.println(counter);
//				System.out.println("found a 5 at index" + i);
//				if(counter >=3) {
//					System.out.println("dayummm thats a lot of 5s");
//					System.out.println(counter);
//				}else {
//					System.out.println("get your 5s up boiiiii");
//				}
//			}
//		}
		/*
		 * 0 int x = 5; double myDouble = 5.5; boolean f = false; char c = 't'; String
		 * str = "Hello World\'s"; System.out.println(x + myDouble);
		 * System.out.println(c); System.out.println(f); System.out.println(str);
		 */

//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		
//		if (s.equals("tim")) {
//			System.out.println("you typed tim");
//		} else if(s.equals("jim")) {
//			System.out.println("you didnt type tim");
//		} else {
//			System.out.println("your name is wack");
//		}

	}

	public static void hi(String str, int x) {
		for (int i = 0; i < x; i++) {
			System.out.println(str);
		}

	}
}
