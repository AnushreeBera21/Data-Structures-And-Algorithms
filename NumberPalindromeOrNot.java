package Chapter1;

import java.util.Scanner;

public class NumberPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Is palindrome : " + isPalindrome(num));
    }

    public static boolean isPalindrome(int num){

//        return num == revers(num);

        StringBuilder str = new StringBuilder(Integer.toString(num));
        str.reverse();
        return str.toString().equals(Integer.toString(num));
    }


    public static int revers(int num){
        int res = 0;
        while(num != 0){
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }
}
