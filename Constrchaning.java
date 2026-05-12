class Demo {

    Demo() {
        this(10);
        System.out.println("Default Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized Constructor");
    }
}
    public class Constrchaning{
         
    public static void main(String[] args) {

        Demo d = new Demo();
    }
}