package Chapter1;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),res = 0;
        while(num != 0){
            res = res * 10 + num % 10;
            num /= 10;
        }
        System.out.println(res);
    }
}
