public class Test {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.firstName = "Hayk";
        human1.lastName = "Babayan";
        human1.IsArmenian = true;
        human1.gender = 'm';
        human1.year = 2000;

        Human human2 = new Human();
        human2.firstName = "Ani";
        human2.lastName = "Grigoryan";
        human2.IsArmenian = true;
        human2.gender = 'f';
        human2.year = 2005;


        int x = human1.sum(4, 9);
        System.out.println(x);

        human1.printFullName();
        human2.printFullName();



        System.out.println("--------------------------------");
        int[] a = {4, 5, -6, 7, 4, -1, 1, -4, 1};
        System.out.println("babl sort");
        boolean b = true;
        int countOfFors = 0;
        while (b) {
            b = false;
            for (int i = 0; i < a.length - 1 - countOfFors; i++) {
                if (a[i] > a[i + 1]) {
                    int z = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = z;
                    b = true;
                }
            }
            countOfFors++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
