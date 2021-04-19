public class Test {

    public static void main(String[] args) {
        String s = "arrA";


        Test t = new Test();
        System.out.println(t.isPalindrome(s));
        Test fib =new Test();
        System.out.println(fib.fib(8));
        Test tt =new Test();
        System.out.println(tt.f(7));



        int y = 5;

        for (int i = 1; i <= y; i++) {
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }


    }

    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;

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
