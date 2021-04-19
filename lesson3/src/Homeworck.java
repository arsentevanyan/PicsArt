public class Homeworck {

    public static void main(String[] args) {

        System.out.println("\n1. Create an array and fill it with 2 number.");
        int[] a = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        System.out.println("\n2.  Create an array nd fill it with numbers from 1:1000.");
        int[] b = new int[1000];
        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }

        System.out.println("\n3.  Create an array and fill it whit odd numbers from -20:20");

        int arraylenght = 0;
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0)
                arraylenght++;
        }
        int[] c = new int[arraylenght];
        for (int i = 0, j = -19; i < arraylenght; i++, j += 2) {
            c[i] = j;


        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }

        System.out.println("\n4. Create an array and fill it. Print all elements which can divided by 5");

        int[] d = {2, 5, 9, 10, -15, 20, 35, 66, 99, -95, 955};
        for (int i = 0; i < d.length; i++) {
            if (d[i] % 5 == 0)
                System.out.print(d[i] + ", ");
        }

        System.out.println("\n5. Create an array and fill it. Print all elements which are between 24.12 and 467.23");

        double[] f = {2.3, 45.2, 24.1, 88.965, 500, 400, 622.3};
        for (int i = 0; i < f.length; i++) {
            if (f[i] > 24.12 && f[i] < 467.23)
                System.out.print(f[i] + ", ");
        }

        System.out.println("\n6. Create an array and fill it. Print count of elements which can be divided by 2");

        int[] k = {5, 2, 5, 9, 10, -15, 20, 35, 66, 99, -95, 955, 4, 62, -100, 88, -2, 0, 55, 800};
        int count = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i]%2==0)
                count++;
        }
        System.out.println(count);

        System.out.println("\n7. Given an integer, 0<N<21, print its first 10 multiples");
        int n =5;
        for (int i = 1; i <11 ; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }

    }
}
