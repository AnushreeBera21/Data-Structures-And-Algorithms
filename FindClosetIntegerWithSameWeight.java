package Chapter1;

import java.util.Scanner;

public class FindClosetIntegerWithSameWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int lbs = n & -n;
        int lbns = ~n & (n+1);

        if (lbns > lbs){
            n |= lbns;
            n ^= lbns >> 1;
        }
        else {
            n ^= lbs;
            n |= lbs>>1;
        }
        System.out.println(Integer.toBinaryString(n));

    }
}
