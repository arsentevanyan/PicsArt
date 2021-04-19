public class Test {
    public static void main(String[] args) {

        System.out.println("\n1. Print  ** ");
        int y = 6;
        for (int i = 1; i <= y; i++) {
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("\n2. Print number from -10 to 10");
        for (int i = -10; i < 11; i++) {
            System.out.print(i + ", ");

        }
        System.out.println("\n3. Print even numbers from -20 to 10");
        for (int i = -20; i < 11; i += 2) {
            System.out.print(i + ", ");

        }

        System.out.println("\n4. Print number from -10 to 20 which can be divider by 5 or 3");
        for (int i = -10; i < 21; i++) {
            if (i % 5 == 0 || i % 3 == 0)
                System.out.print(i + ", ");

        }

        System.out.println("\n4. Print array");
        int[] array = {3, -3, 1, 4, 8, 5, 7, 5, 22, -44, 50};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element in index %d is %d!\n", i, array[i]);

        }
        System.out.println("\n6. Print array revers");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");

        }

        System.out.println("\n7. Print elemants >5 and <10");

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10)
                System.out.print(array[i] + ", ");

        }
        System.out.println("\n8. Print count of negative values in array");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                count++;


        }
        System.out.println(count);

        System.out.println("\n9. Print create array with 1-10 numbers");
        int[] aa = new int[10];
        for (int i = 0; i < aa.length; i++) {
            aa[i] = i + 1;
        }
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + ", ");
        }


        System.out.println("\n10. Create arrey with even nombers betvin -10 and 20");

        int arraylenght = 0;
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                arraylenght++;
        }
        int[] b = new int[arraylenght];
        for (int i = 0, j = -10; i < arraylenght; i++, j += 2) {
            b[i] = j;


        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }


        System.out.println("\n11. Print max and min");
        int[] a = {4, 62, -100, 88, -2, 0, 55, 800};
        int max = a[0];
        int min = a[0];

        for (int i = 1;i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);


    }
}



