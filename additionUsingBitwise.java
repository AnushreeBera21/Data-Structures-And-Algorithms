package Chapter1;

import java.util.Scanner;

public class additionUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(), c = 0;
        while(b != 0 ){
            System.out.println(Integer.toBinaryString(c));
            System.out.println(Integer.toBinaryString(a));
            System.out.println(Integer.toBinaryString(b));
            c = a & b;
            a = a ^ b;
            b = c << 1;

        }
        System.out.println(a);
    }

}
