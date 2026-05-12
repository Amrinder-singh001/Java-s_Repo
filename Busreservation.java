class Bus {

    int seatNo;

    Bus(int seatNo) {
        this.seatNo = seatNo;
    }

    void display() {
        System.out.println(seatNo);
    }
}
    public class Busreservation {
    public static void main(String[] args) {

        Bus b[] = new Bus[2];

        b[0] = new Bus(1);
        b[1] = new Bus(2);

        b[0].display();
        b[1].display();
    }
}