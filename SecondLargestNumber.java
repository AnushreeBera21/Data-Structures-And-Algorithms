package Chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ar = new int[5];
        for(int i = 0 ;i < ar.length;i++)
            ar[i] = sc.nextInt();
        Arrays.sort(ar);
        System.out.println(ar[ar.length - 2]);
    }
}
