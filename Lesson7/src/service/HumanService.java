package service;

import model.Human;

import java.util.Scanner;

public class HumanService {


    public Human create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter human first name");
        String fName = s.next();

        System.out.println("Enter human last name");
        String lName = s.next();

        System.out.println("Enter human birth year");
        int year = s.nextInt();

        System.out.println("Enter human gender, m/f");
        char gender = s.next().charAt(0);

        System.out.println("Enter human weight");
        double weight = s.nextDouble();

        System.out.println("Enter human is Armenian?  (y/n)");
        boolean isArmenian = s.next().charAt(0) == 'y';

        Human human = new Human(fName, lName, year);
        human.setGender(gender);
        human.setWeight(weight);
        human.setArmenian(isArmenian);
        return human;


    }

    public void printYesYearAfter2000(Human human) {
        System.out.println(human.getYear() > 2000 ? "yes" : "No");
    }

    public String nameOfHeavier(Human h1, Human h2) {
        return h1.getWeight() >= h2.getWeight() ? h1.getFirstName() : h2.getFirstName();
    }

    public Human humanEithLongestLastName(Human h1, Human h2) {
        return h1.getLastName().length() >= h2.getLastName().length() ? h1 : h2;
    }

    public void printYoungestName(Human h1, Human h2, Human h3) {
        Human youngest = h1.getYear() > h2.getYear() ? h1 : h2;
        if (youngest.getYear() < h3.getYear())
            youngest = h3;
        System.out.println(youngest.getFirstName());
    }

    public void printFullNameOfArmenianAfter2000(Human[] humans) {
        for (Human human : humans) {
            if (human.isArmenian() && human.getYear() > 2000) {
                human.fullName();
            }
        }
    }

    public Human smallestWeight(Human[] humans) {

        Human min = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (humans[i].getWeight() < min.getWeight()) {
                min = humans[i];
            }
        }
        return min;
    }

    public void countOfNotArmenians(Human[] humans) {
        int count = 0;
        for (Human h : humans) {
            if (!h.isArmenian()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public Human[] humansAfter2000(Human[] humans) {
        int count = 0;
        for (Human human : humans) {
            if (human.getYear() > 2000) {
                count++;
            }
        }

        Human[] result = new Human[count];
        int index = 0;
        for (Human human : humans) {
            if (human.getYear() > 2000) {
                result[index++] = human;
            }
        }

        return result;
    }

    public Human oldestFromArmenians(Human[] humans) {

        Human human = null;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].isArmenian()) {
                if (human == null)
                    human = humans[i];
                else {
                    if (humans[i].getYear() < human.getYear()) {
                        human = humans[i];
                    }
                }
            }
        }
        return human;

    }

    public Human[] orderbyWeight(Human[] humans) {
        boolean isActive = true;
        int countOfFors = 0;
        while (isActive) {
            isActive = false;


            for (int i = 0; i < humans.length - 1 - countOfFors; i++) {
                if (humans[i].getWeight() > humans[i + 1].getWeight()) {
                    Human x = humans[i];
                    humans[i] = humans[i + 1];
                    humans[i + 1] = x;
                    isActive = true;


                }


            }
            countOfFors++;


        }

        return humans;
    }

}