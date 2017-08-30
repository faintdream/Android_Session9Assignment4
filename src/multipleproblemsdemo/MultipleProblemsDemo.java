/*
 * There are multiple problems to solve on this assignment,
 * so i have added goal for each task in the corresponding class file 
 */
package multipleproblemsdemo;                                           // package name 

import java.util.TreeSet;                                               // importing TressSet class

public class MultipleProblemsDemo {                                     //main class 

    public static void main(String[] args) {                            // main section 

        Employee objE1 = new Employee();                                  //creating object of EMployee class
        Employee objE2 = new Employee();                                  //creating object of EMployee class
        Employee objE3 = new Employee();                                  //creating object of EMployee class
        Employee objE4 = new Employee();                                  //creating object of EMployee class

        objE1.name = "Apple Boy";                                         //setting variable values for object
        objE1.designation = "SE";
        objE1.salary = 2000;

        objE2.name = "Apple Boy";                                         //setting variable values for object
        objE2.designation = "SE";
        objE2.salary = 1000;

        objE3.name = "Linux Boy";                                         //setting variable values for object
        objE3.designation = "SE";
        objE3.salary = 500;

        objE4.name = "MS Boy";                                            //setting variable values for object
        objE4.designation = "SE";
        objE4.salary = 3500;

//        TreeSet<Employee> emp = new TreeSet<>();                //creating a TreeSet  named emp
//        emp.add(objE1);                                                 //adding object ( & its fields ) to emp treeset
//        emp.add(objE2);                                                 //adding object ( & its fields ) to emp treeset
//        emp.add(objE3);                                                 //adding object ( & its fields ) to emp treeset
//        emp.add(objE4);                                                 //adding object ( & its fields ) to emp treeset
//        
        PrintDupes objPD = new PrintDupes(); // defining object of PrintDupes
        objPD.evalDupes();                  // calling evalDupes to evaluate duplicates

        System.out.println("--------------------");

        UnionSet objUS = new UnionSet();                    //creating object of UnionSet class objUS
        objUS.getFirstSet();                                //calling getFirstSet Method to get first set

        System.out.println("--------------------");

        objUS.getSecondSet();                               //calling getSecondSet Method to get second set

        System.out.println("--------------------");

        objUS.getUnion();                                   //calling getUnion method which basically joins first and second set ( without duplicates)

        System.out.println("--------------------");

        OnlyEven objOE = new OnlyEven();                    //declaring objOE for OnlyEven class 
        objOE.getOnlyEven();                                // calling getOnlyEven class to print even numbers in the list
    }

}
