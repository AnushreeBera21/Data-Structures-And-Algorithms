package Chapter1;

import java.util.Scanner;

public class GenerateParityBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while(a != 0){
            a = a & a-1;
            a = a >> 1;
            ++sum;
        }
        System.out.println("Parity bit is : "+ (sum % 2 == 0 ? 1 : 0));

    }
}
