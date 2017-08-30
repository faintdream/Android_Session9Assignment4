/*
 *  program to add integer objects into ArrayList and print
only even numbers present in the ArrayList.
 */
package multipleproblemsdemo;                                       // package declaration

import java.util.ArrayList;                                         // importing arraylist class 

public class OnlyEven {                                              // declaring OnlyEven class

    ArrayList<Integer> numbers = new ArrayList<>();                 // declaring an arraylist named numbers 

    OnlyEven() {                                                    // default constructor for the class 
        for (int i = 1; i <= 10; i++) {                             // running a simple loop
            if (i % 2 == 0) // only when given number is divisable  by 2
            {
                numbers.add(i);                                         // add it to arraylist
            }
        }

    }

    void getOnlyEven() {                                             // method to print even numbers 
        System.out.println("Even numbers between 1 to 10");
        for (Integer number : numbers) {                                // advanced for loop 
            System.out.println(number);                              // print value in arraylist
        }
    }

}
