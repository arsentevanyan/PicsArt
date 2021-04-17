package main;

import model.Human;
import service.HumanService;

import java.lang.reflect.Array;

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

        Human[] humans;
        humans = new Human[]{human1, human2, human3};

        System.out.println("------------------------------");
        System.out.println("Is human birth after 2000 year");
        service.printYesYearAfter2000(human1);
        System.out.println("------------------------------");
        System.out.println("Name of heavier human of 2");
        System.out.println(service.nameOfHeavier(human1, human2));
        System.out.println("------------------------------");
        System.out.println("Print longest last name human of 2");
        service.humanEithLongestLastName(human1, human2).printInfo();
        System.out.println("------------------------------");
        System.out.println("Print youngest human name of 3");
        service.printYoungestName(human1, human2, human3);
        System.out.println("------------------------------");
        System.out.println("Print full name of Armenian after 2000 ( arrey 3 )");
        service.printFullNameOfArmenianAfter2000(humans);
        System.out.println("------------------------------");
        System.out.println("Print smallest weight ( arrey 3 )");
        System.out.println(service.smallestWeight(humans).getWeight());
        ;
        System.out.println("------------------------------");
        System.out.println("print count of not Armenian ( arrey 3 )");
        service.countOfNotArmenians(humans);
        System.out.println("------------------------------");
        System.out.println("Print humans after 2000 (array 3 )");
        for (int i = 0; i < service.humansAfter2000(humans).length; i++) {
            service.humansAfter2000(humans)[i].printInfo();
        }
        System.out.println("------------------------------");
        System.out.println("Print oldest arminean ( arrey 3 )");
        service.oldestFromArmenians(humans).printInfo();
        System.out.println("------------------------------");
        System.out.println("Print humans ordered by weight");
        for (int i = 0; i < service.humansAfter2000(humans).length; i++) {
            service.humansAfter2000(humans)[i].fullName();
        }
        System.out.println("------------------------------");


    }
}
