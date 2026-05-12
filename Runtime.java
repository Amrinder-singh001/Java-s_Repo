class Shape {

    void area() {
        System.out.println("Area Calculation");
    }
}

class Circle extends Shape {

    void area() {
        double r = 5;
        System.out.println("Circle Area = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {

    void area() {
        int l = 10, b = 5;
        System.out.println("Rectangle Area = " + (l * b));
    }
}

class Runtime {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}