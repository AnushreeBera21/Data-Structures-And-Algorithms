package Chapter1;

import java.util.Scanner;

public class MultiplicationUsingBitWise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(),res = 0;
        boolean sign = (a ^ b) > 0;
        a = Math.abs(a); b = Math.abs(b);
        while (b > 0){
            if ((b & 1) != 0)
                res = res + a;
            a = a << 1;
            b = b >> 1;
        }
        System.out.println(sign ? res : -res);
    }
}
