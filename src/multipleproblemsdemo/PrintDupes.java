/*
 * program to print the duplicate values in an array list.
 */
package multipleproblemsdemo;                               // package declaration

import java.util.ArrayList;                                 //importing ArrayList
import java.util.HashSet;                                   //importing Hash set
import java.util.Set;                                       //importing set

public class PrintDupes {                                   //defining PrintDupes class 

    ArrayList<String> name = new ArrayList<>();             //defining arraylist name of String type 

    PrintDupes() {                                          // class's Default constructor

        name.add("Akash");                                 //adding some values 
        name.add("Akash");
        name.add("akash");
        name.add("Rohan");
        name.add("Sakshi");
        name.add("Sakshi");                         

    }

    protected void evalDupes() {                            // this method evaluates ArrayList for duplicates
        Set<String> dupe = new HashSet<>();                 // declaring a hashset dupe
        for (String item : name) {                          // running an advanced loop on arralylist name
            if (dupe.add(item) == false) {                  // since we know that set only stores non redundant information
                                                            // when hashset fails to add an item, it indicates that it is duplicate
                System.out.println("Duplicate: " + item);   // which we can print as duplicate value
            }
        }
    }

}
