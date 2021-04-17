public class Test {
    public static void main(String[] args) {
        String s = "arrA";


        Test t = new Test();
        System.out.println(t.isPalindrome(s));
    }

    public boolean isPalindrome(String s){
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;

    }
}
