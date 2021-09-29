package LAB14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q1 {
	public static void main(String args[]) {
	      // Create a hash map
	      HashMap hm = new HashMap();
	      // Put elements to the map
	      hm.put("Bag", new Integer(1100));
	     
	      hm.put("Book", new Integer(800));
	      hm.put("Pen", new Integer(700));
	     
	      // Get a set of the entries
	      Set set = hm.entrySet();
	      System.out.println("Elements in HashMap:");
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      System.out.println("Does Sunglasses exist in the HashMap = "+hm.containsKey("Sunglasses"));
	   }

}
