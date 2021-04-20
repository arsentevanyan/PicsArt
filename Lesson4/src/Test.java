public class Test {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setFirstName("Hayk");
        human1.setLastName("Babayan");
        human1.setArmenian(true);
        human1.setGender('m');
        human1.setYear(2000);


        Human human2 = new Human();
        human2.setFirstName("Poxos");
        human2.setLastName("Chobanyan");
        human2.setArmenian(false);
        human2.setGender('m');
        human2.setYear(1997);


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
