class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    int roll;

    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    void display() {
        System.out.println(name);
        System.out.println(roll);
    }
}

public class CollageManage {
    public static void main(String[] args) {

        Student s = new Student("Amrinder", 101);

        s.display();
    }
}
