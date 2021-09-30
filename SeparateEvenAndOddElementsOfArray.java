package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateEvenAndOddElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int num;
        for(int i = 0 ; i < 6; i++) {
            num = sc.nextInt();
            if(num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }
        System.out.println("Even Numbers : " + even);
        System.out.println("Odd Numbers : " + odd);


    }
}
