public class Test {
    public static void main(String[] args) {

        Test t = new Test();
        System.out.println(t.f(4));
        Test tt = new Test();
        System.out.println(tt.fib(8));

        int y = 5;

        for (int i = 1; i <= y; i++) {
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

    }

    public int f(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * f(x - 1);


    }

    public int fib(int xx) {
        if (xx == 1 || xx == 2) {
            return 1;
        }
        return fib(xx - 1) + fib(xx - 2);


    }
}



