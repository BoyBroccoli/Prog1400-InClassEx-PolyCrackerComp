import payrollSystem.*;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Creating Objects and initializing

        Employee emp1 = new Commissioned("Bob", "Loblaw", 40000);
        Employee emp2 = new Salaried("Sue", "Me", 10);
        Employee emp3 = new PieceWorker("Tina", "Zena", 1000);
        Employee emp4 = new Manager("Richard", "Rich", 2000);


        // Creating ArrayList and Initializing with objects
        ArrayList<Employee> myEmployees =
                new ArrayList<Employee>(Arrays.asList(emp1, emp2, emp3, emp4));


        // for each loop to print array contents
        for(Employee empList : myEmployees){
            System.out.println(empList.toString());
            System.out.println("\n");
        }

    }
}