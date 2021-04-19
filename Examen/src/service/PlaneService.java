package service;

import model.Plane;

import java.util.Scanner;


public class PlaneService {


    public Plane create() {

        Scanner s = new Scanner(System.in);
        System.out.println("name of the plane (Any not empty string)");
        String model = s.next();

        System.out.println("country the plane belongs to (Any not empty string)");
        String country = s.next();
        System.out.println("country the plane belongs to (Any not empty string)");
        int year = s.nextInt();
        System.out.println("hours in air (from 0 to 10000)");
        double hours = s.nextDouble();
        System.out.println("is military or not");
        char military = s.next().charAt(0);
        System.out.println("weight of plane (from 1000 KG to 160000 KG)");
        double weight = s.nextDouble();
        System.out.println("maximal speed per hour (1000 km/h) (any not negative value)");
        int topSpeed = s.nextInt();
        System.out.println("number of seats (any not negative value)");
        int seats = s.nextInt();
        System.out.println("cost of the plane  (any not negative value)");
        double cost = s.nextDouble();

        Plane plane = new Plane(model, country, year, hours, military, weight, topSpeed, seats, cost);

        return plane;


    }


    public void parameterOnePlane(Plane plane) {
        if (plane.getMilitary() == 'm') {
            System.out.println("Top Speed is " + plane.getTopSpeed());
            System.out.println("Cost is " + plane.getCost());
        } else {
            System.out.println("Plan model is" + plane.getModel());
            System.out.println("Plan country is" + plane.getCountry());

        }
    }


    public Plane newerPlane(Plane p1, Plane p2) {

        if (p1.getYear() >= p2.getYear())
            return p1;
        else
            return p2;


    }

    public void smallestSeatsCount(Plane p1, Plane p2, Plane p3) {
        Plane smallestSeats = p1.getSeats() <= p2.getSeats() ? p1 : p2;
        if (smallestSeats.getSeats() > p3.getSeats())
            smallestSeats = p3;
        System.out.println("country of the plane with smallest seats count " + smallestSeats.getCountry());
    }

    public void printNotMilitaryPlans(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getMilitary() == 'n')
                planes[i].printInfo();

        }
    }

    public void printPlansMor100Hours(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getHours() > 100 && planes[i].getMilitary() == 'y')
                planes[i].printInfo();

        }
    }

    public Plane minWeight(Plane[] planes) {

        Plane minWeight = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= minWeight.getWeight()) {
                minWeight = planes[i];
            }
        }
        return minWeight;
    }

    public Plane minimalCostFromAllMilitaryPlanes(Plane[] planes) {

        Plane plane = null;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getMilitary() == 'y') {
                if (plane == null)
                    plane = planes[i];
                else {
                    if (planes[i].getCost() < plane.getCost()) {
                        plane = planes[i];
                    }
                }
            }

        }
        return plane;
    }

    public void planesInAscendingFormOrderByYear(Plane[] planes) {

        boolean isActive = true;
        int countOfFors = 0;
        while (isActive) {
            isActive = false;

            for (int i = 0; i < planes.length - 1 - countOfFors; i++) {
                if (planes[i].getYear() < planes[i + 1].getYear()) {
                    Plane p = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = p;
                    isActive = true;
                }


            }
            countOfFors++;
        }
        for (int i = 0; i < planes.length; i++) {

            planes[i].printInfo();

        }

    }


}



