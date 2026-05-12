class Mobile {

    String name;
    int price;

    Mobile(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}
    public class Arrayofobj {
    public static void main(String[] args) {

        Mobile m[] = new Mobile[2];

        m[0] = new Mobile("Samsung", 20000);
        m[1] = new Mobile("iPhone", 80000);

        m[0].display();
        m[1].display();
    }
}