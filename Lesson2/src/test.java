public class test {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(a % b);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println((a > b) && (a < b));
        System.out.println((a > b) || (a < b));
        System.out.println(!(a > b) && (a < b));

        int c = 60, d = 13;
        System.out.println(c & d);
        System.out.println(c | d);
        System.out.println(c ^ d);
        System.out.println(c >>> 2);
        System.out.println(~c);
        System.out.println(d << 1);
        c += d;

    }
}
