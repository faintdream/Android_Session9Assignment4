/*
 * program to copy all the elements from set2 to set1 so that
 * the set1 becomes the union of set1 and set2.
 */



package multipleproblemsdemo;                                       //package declaration

import java.util.HashSet;                                           // importing hashset
import java.util.Set;                                               // importing set
import java.util.TreeSet;                                           // importing Treeset , it does natural sorting be default

public class UnionSet {                                            // declaring class UnionSet

    Set<String> first_set = new HashSet<>();                              //declaring set first_set to hold first set values
    Set<String> second_set = new HashSet<>();                          //declaring set first_set to hold second set values

    UnionSet() {                                                        //calling default constructor

        first_set.add("akash");                                         //adding values to first set
        first_set.add("akash");
        first_set.add("prakash");
        first_set.add("suyesh");

        second_set.add("akash");                                        //adding values to second set
        second_set.add("apple");
        second_set.add("orange");

        
    }

    void getFirstSet() {                                                // this method displays first set values
        System.out.println("First set Values");             
        for (String item : first_set) {                                 //advanced loop on first_set
            System.out.println(item);                                   // to print each value
        }
    }

    void getSecondSet() {                                               // this method displays value of second_set
        System.out.println("Second set Values");
        for (String item : second_set) {                                //advanced loop on second_set
            System.out.println(item);                                   // to print each value
        }
    }

    void getUnion() {                                                   //this method displays union of first and second set
                                                                        // i.e. uniqueu values of both sets merged together
        Set union = new TreeSet(first_set);                             // creating a treeset named union 
        union.addAll(second_set);                                       // using addall method to copy second_set values to first_set
        System.out.println("Union Values");                             // printing union values
        for(Object item: union){                                        // advanced for loop on union set
            System.out.println(item);                                   // printing each value
        }
    }

}
