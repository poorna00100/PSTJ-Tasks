import java.util.*;

class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}

class Vehicle {
    double calculateFare(double distance) {
        return 0;
    }
}

class Bike extends Vehicle {
    double calculateFare(double distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }
}

class Trip {
    Driver driver;
    Rider rider;
    Vehicle vehicle;
    double distance;

    Trip(Driver driver, Rider rider, Vehicle vehicle, double distance)
            throws InvalidBookingException {

        if (distance <= 0) {
            throw new InvalidBookingException("Invalid distance");
        }

        this.driver = driver;
        this.rider = rider;
        this.vehicle = vehicle;
        this.distance = distance;
    }

    double getFare() {
        return vehicle.calculateFare(distance);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Driver driver = new Driver("Driver1");
        Rider rider = new Rider("Rider1");

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                Vehicle vehicle;

                if (type.equals("Bike")) {
                    vehicle = new Bike();
                } 
                else if (type.equals("Auto")) {
                    vehicle = new Auto();
                } 
                else if (type.equals("Cab")) {
                    vehicle = new Cab();
                } 
                else {
                    throw new InvalidBookingException("Invalid ride type");
                }

                Trip trip = new Trip(driver, rider, vehicle, distance);

                System.out.println((int) trip.getFare());

            } catch (InvalidBookingException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
