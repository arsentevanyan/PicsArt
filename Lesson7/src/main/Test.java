package main;

import model.Human;
import service.HumanService;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        HumanService service = new HumanService();
        System.out.println("For Human 1");
        Human human1 = service.create();
        System.out.println("For Human 2");
        Human human2 = service.create();
        System.out.println("For Human 3");
        Human human3 = service.create();
        human1.printInfo();
        human2.printInfo();
        human3.printInfo();
        Human[] humans = {human1, human2, human3};


        Scanner s = new Scanner(System.in);

        boolean isMenuActive = true;
        while (isMenuActive) {

            System.out.println("Enter command number");
            System.out.println("1.  Is human birth after 2000 year");
            System.out.println("2.  Name of heavier human of 2");
            System.out.println("3.  Print longest last name human of 2");
            System.out.println("4.  Print youngest human name of 3");
            System.out.println("5.  Print full name of Armenian after 2000 ( arrey 3 )");
            System.out.println("6.  Print smallest weight ( arrey 3 )");
            System.out.println("7.  print count of not Armenian ( arrey 3 )");
            System.out.println("8.  Print humans after 2000 (array 3 )");
            System.out.println("9.  Print oldest arminean ( arrey 3 )");
            System.out.println("10. Print humans ordered by weight");
            System.out.println("11. Exit");

            int comand = s.nextInt();

            switch (comand) {

                case 1:
                    service.printYesYearAfter2000(human1);
                    break;
                case 2:
                    System.out.println(service.nameOfHeavier(human1, human2));
                    break;
                case 3:
                    service.humanEithLongestLastName(human1, human2).printInfo();
                    break;
                case 4:
                    service.printYoungestName(human1, human2, human3);
                    break;
                case 5:
                    service.printFullNameOfArmenianAfter2000(humans);
                    break;
                case 6:
                    System.out.println(service.smallestWeight(humans).getWeight());
                    break;
                case 7:
                    service.countOfNotArmenians(humans);
                    break;
                case 8:
                    for (int i = 0; i < service.humansAfter2000(humans).length; i++) {
                        service.humansAfter2000(humans)[i].printInfo();
                    }
                    break;
                case 9:
                    service.oldestFromArmenians(humans).printInfo();
                    break;
                case 10:
                    for (int i = 0; i < service.orderbyWeight(humans).length; i++) {
                        service.orderbyWeight(humans)[i].fullName();
                    }
                    break;
                case 11:
                    isMenuActive = false;
                    System.out.println("bye");
                    break;

            }
        }


    }
}
