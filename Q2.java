package LAB14;

import java.util.Enumeration;
import java.util.Hashtable;

public class Q2 {
	public static void main(String[] args)
    {
 
        // Creating Hashtable object where key is of Integer
        // type and value is of String type
        Hashtable<Integer, String> ht = new Hashtable<>();
 
        // Putting key-value pairs to HashTable object
        // Custom input entries
        ht.put(1, "Sumegha");
        ht.put(2, "Gudi");
        ht.put(3, "Sourabh");
        ht.put(4, "Desai");
       
 
        // Creating  Enumeration interface
        // and get keys() from Hashtable
        Enumeration<Integer> e = ht.keys();
 
        // Iterating through the Hahstable
        // object
 
        // Checking for next element in Hashtable object
        // with the help of hasMoreElements() method
        while (e.hasMoreElements()) {
 
            // Getting the key of a particular entry
            int key = e.nextElement();
 
            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                               + "\t\t Name : "
                               + ht.get(key));
        }
    }
}


