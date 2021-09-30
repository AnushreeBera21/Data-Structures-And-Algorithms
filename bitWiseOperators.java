package Chapter1;

public class bitWiseOperators {
    public static void main(String[] args) {
        System.out.println(2 | 3); // bitwise or
        System.out.println(2 & 3);// bitwise and
        System.out.println(~ 3); // -(n+1)
        System.out.println(2 ^ 3); // bitwise xor

        int b  = -10;
        System.out.println(-10 >> 1);   // signed right shift :  x >> a == x / 2^a , void space filled with signed bit(0 if +ve and 1 if -ve)
        System.out.println(b >>> 1); // unsigned right shift :  x >> a == x / 2^a, void space filled with 0
        System.out.println(2 << 3); // left shift x << a == x * 2^a
    }
}
