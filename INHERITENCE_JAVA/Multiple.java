class GrandFather {

    void land() {
        System.out.println("GrandFather Land");
    }
}

class Father extends GrandFather {

    void house() {
        System.out.println("Father House");
    }
}

class Son extends Father {

    void bike() {
        System.out.println("Son Bike");
    }
}
    public class Multiple {
    public static void main(String[] args) {

        Son s = new Son();

        s.land();
        s.house();
        s.bike();
    }
}