class Employee {

    int id;
    String name;

    static String company = "Infosys";

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + company);
    }
}
    public class statick {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Employee(2, "Aman");

        e1.display();
        e2.display();
    }
}