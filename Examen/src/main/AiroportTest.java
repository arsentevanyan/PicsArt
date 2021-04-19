package main;


import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AiroportTest {

    public static void main(String[] args) {

        PlaneService service = new PlaneService();
        System.out.println("For Plane 1");
        Plane plane1 = service.create();
        System.out.println("For Plane 2");
        Plane plane2 = service.create();
        System.out.println("For Plane 3");
        Plane plane3 = service.create();
        Plane[]planes={plane1,plane2,plane3};

        Scanner s = new Scanner(System.in);
        boolean isMenuActive = true;
        while (isMenuActive){

            System.out.println("Enter command number");
            System.out.println("1.  print cost and topSpeed if the plane is military otherwise print model and country");
            System.out.println("2.  return the plane which one is newer (if they have the same age return first one)");
            System.out.println("3.  print country of the plane with smallest seats count (if they have the same - print " +
                    "first)");
            System.out.println("4.  print all not military planes.");
            System.out.println("5.  print all military planes which were in air more than 100 hours.");
            System.out.println("6.  return the plane with minimal weight (if there are some of them return last one)");
            System.out.println("7.  return the plane with minimal cost from all military planes (if there are some of" +
                    " them return first one)");
            System.out.println("8.  print planes in ascending form order by year");
            System.out.println("9. Exit");


            int comand = s.nextInt();

            switch(comand){
                case 1:
                    service.parameterOnePlane(plane1);
                    break;
                case 2:
                    service.newerPlane(plane1,plane2);
                    break;
                case 3:
                    service.smallestSeatsCount(plane1,plane2,plane3);
                    break;
                case 4:
                    service.printNotMilitaryPlans(planes);
                    break;
                case 5:
                    service.printPlansMor100Hours(planes);
                    break;
                case 6:
                    service.minWeight(planes);
                    break;
                case 7:
                    service.minimalCostFromAllMilitaryPlanes(planes);
                    break;
                case 8:
                    service.minimalCostFromAllMilitaryPlanes(planes);
                    break;
                case 9:
                    isMenuActive=false;
                    System.out.println("Bye bye");
                    break;





            }

        }



    }


}
