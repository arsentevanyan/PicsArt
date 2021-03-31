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

        int[] z = new int[5];
        z[0] = 7;
        z[4] = 8;
        System.out.println(z[0]);
        System.out.println(z.length);
        System.out.println(z[z.length - 1]);

        int[] m;
        m = new int[]{2, 5, 8, 9, 5, 3,};
        System.out.println(m[m.length - 1]);

        int[][] k = {{4, 6}, {7, 9, 0}, {6, 0, 4, 3}};
        System.out.println(k[k.length - 2][k.length - 1]);

        int[][] ll;
        ll = new int[][]{{1, 2, 7}, {3, 4, 5,}};
        System.out.println(ll[1][1]);


        if (m[0] > 3) {
            System.out.println("Ayo");
        } else {
            System.out.println("voch");
        }

        int A = 8;
        String B;
        if (a % 2 == 0) {
            B = "zuyg";
        } else {
            B = "kent";
        }
        System.out.println(B);


        String v = a % 2 == 0 ? "zuygik " : "kentik";
        System.out.println(v);

        int x = 64;

        System.out.println((x & (x - 1))  == 0 ? "ayo" : "voch");


    }
}
