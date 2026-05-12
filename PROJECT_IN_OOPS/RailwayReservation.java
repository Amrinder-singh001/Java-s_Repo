package PROJECT_IN_OOPS;

import java.util.Scanner;

abstract class Coach {

    abstract void calculateFare();

    void trainInfo() {
 
        System.out.println("\n===== Train Information =====");
        System.out.println("Train Name : Chennei Express");
        System.out.println("Route      : Chandigarh to Amritsar");
    }
}

class SleeperCoach extends Coach {

    int fare = 500;

    void calculateFare() {

        System.out.println("Coach Type : Sleeper Coach");
        System.out.println("Ticket Fare: " + fare);
    }
}

class ACCoach extends Coach {

    int fare = 1500;

    void calculateFare() {

        System.out.println("Coach Type : AC Coach");
        System.out.println("Ticket Fare: " + fare);
    }
}

class Passenger {

    private String name;
    private int age;

    Passenger(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void displayPassenger() {

        System.out.println("\n===== Passenger Details =====");
        System.out.println("Passenger Name : " + name);
        System.out.println("Passenger Age  : " + age);
    }
}

class Reservation {

    int ticketNumber;

    Reservation(int ticketNumber) {

        this.ticketNumber = ticketNumber;
    }

    void bookTicket() {

        System.out.println("\n===== Reservation Details =====");
        System.out.println("Ticket Booked Successfully");
        System.out.println("Ticket Number : " + ticketNumber);
    }
}

public class RailwayReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Passenger Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Ticket Number: ");
        int ticketNo = sc.nextInt();

        System.out.println("\nSelect Coach Type");
        System.out.println("1. Sleeper Coach");
        System.out.println("2. AC Coach");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Passenger p1 = new Passenger(name, age);

        Reservation r1 = new Reservation(ticketNo);

        p1.displayPassenger();

        r1.bookTicket();

        Coach c;

        if(choice == 1) {

            c = new SleeperCoach();
        }
        else {

            c = new ACCoach();
        }

        c.trainInfo();
        c.calculateFare();

        sc.close();
    }
}
