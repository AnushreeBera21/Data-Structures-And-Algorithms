package Chapter1;

import java.util.Scanner;

public class TurnOffRightmostBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Binary string(before changing) : " + Integer.toBinaryString(num));
        System.out.println("Right Most : "+(num & (num - 1)) +" " + Integer.toBinaryString(num & (num - 1)));

    }
}
