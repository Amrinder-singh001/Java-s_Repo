package EXAM_JAVA;
abstract class vechile {
   void start(){};
   void stoped(){};
}
class Car {
    public  void start(){
        System
        .out.println("Car is started");
    }

    public void stoped() {
        System.out.println("Car is started");
    }
}

class Bike {
    public void start(){
        System.out.println("Bike is started");
    }

    public void stoped() {
        System.out.println("Bike is started");
    }
}

class Bus {
    
    public void start(){
        System.out.println("Bus is started");
    }

    public void stoped() {
        System.out.println("Bus is started");
    }
}
public class code1 {
  public static void main(String[] args) {
    Car c = new Car();
    c.start();
    c.stoped();

    Bike b = new Bike();
    b.start();
    b.stoped();
   
  
    Bus C = new Bus();
    C.start();
    C.stoped();
}}
