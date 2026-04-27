package CLASSES_OBJECTS;
class Animal {
    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }

    void sleep() {
        System.out.println("Sleepmg");
    }
}
class Fish extends Animal {
    void fins() {
       System.out.println("fins");
    }

    void swim() {
        System.out.println("swims");
        }
    }

public class class_code4 {
    public static void main(String[] args) {
        Fish dolphin = new Fish();

        dolphin.eat();
        dolphin.breathe();
        dolphin.sleep();
        dolphin.fins();
        dolphin.swim();
        
    }
}
