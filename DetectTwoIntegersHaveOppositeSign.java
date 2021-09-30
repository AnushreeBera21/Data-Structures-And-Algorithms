package Chapter1;

import java.util.Scanner;

public class DetectTwoIntegersHaveOppositeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        System.out.println((a ^ b) < 0 ? "They have opposite sign" : "They don't have opposite sign");
    }
}
