class Calculator {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
    public class CompileTime {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.multiply(2, 3));
        System.out.println(c.multiply(2, 3, 4));
    }
}