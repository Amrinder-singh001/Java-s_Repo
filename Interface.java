interface Sports {

    void play();
}

class Cricket implements Sports {

    public void play() {
        System.out.println("Playing Cricket");
    }
}

class Football implements Sports {

    public void play() {
        System.out.println("Playing Football");
    }
}

class Interface {

    public static void main(String[] args) {

        Cricket c = new Cricket();
        Football f = new Football();

        c.play();
        f.play();
    }
}