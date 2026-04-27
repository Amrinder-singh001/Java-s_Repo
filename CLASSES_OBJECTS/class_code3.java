package CLASSES_OBJECTS;

class Employee {
    String name;
    long id;
    float salary;

    Employee(){                // non parametrized constructer 
      System.out.println("constructer is called");
    }

    Employee(String name){     // non parametrized constructer 
       this.name = name;
    }

    Employee(long id){          // parametrized constructer 
       this.id = id;
    }

    // Employee(float salary){   // parametrized constructer 
    //    this.salary = salary;
    // }      
      

}
public class class_code3 {
    public static void main(String[] args) {
        // Employee e = new Employee();
        Employee e1 = new Employee("Amrinder singh");
        Employee e2 = new Employee(250110090);
        
        
        System.out.println(e1.name);
        System.out.println(e2.id);

        
    }
}
