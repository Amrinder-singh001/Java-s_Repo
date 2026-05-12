class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    void circleArea() {
        System.out.println("Circle Area");
    }
}

class Rectangle extends Shape {

    void rectangleArea() {
        System.out.println("Rectangle Area");
    }
}

class Hierarchial {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw();
        c.circleArea();

        r.draw();
        r.rectangleArea();
    }
}