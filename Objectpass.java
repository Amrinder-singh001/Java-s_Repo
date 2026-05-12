class Student {

    int id = 101;

    void display(Student s) {
        System.out.println(s.id);
    }
} 
    public class Objectpass {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display(s1);
    }
}