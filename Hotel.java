class Room {

    void facilities() {
        System.out.println("Basic Facilities");
    }
}

class DeluxeRoom extends Room {

    void wifi() {
        System.out.println("Free WiFi");
    }

    public static void main(String[] args) {

        DeluxeRoom d = new DeluxeRoom();

        d.facilities();
        d.wifi();
    }
}