class Mobile {

    Mobile() {
        System.out.println("Default Mobile");
    }

    Mobile(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        Mobile m2 = new Mobile("Samsung");
    }
}