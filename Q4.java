package LAB14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q4 {
	 public static void main(String args[]){
	      Map<Integer, String> myMap = new HashMap<>();
	      myMap.put(1, "Java");
	      myMap.put(2, "JavaFX");
	      myMap.put(3, "CoffeeScript");
	      myMap.put(4, "TypeScript");

	      ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
	      ArrayList<String> valueList = new ArrayList<String>(myMap.values());

	      System.out.println("contents of the list holding keys the map ::"+keyList);
	      System.out.println("contents of the list holding values of the map ::"+valueList);
	   }

}
