package Chapter2;

import java.util.Scanner;
/*
Write a program which takes as input two strings s and t of bits encoding
binary numbers Bs and B,, respectively, and returns a new string of bits representing
the number Bs + Bt.
 */

public class BinarySumUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.next());
        StringBuilder b = new StringBuilder(sc.next());

        // for making them of same length
        if(a.length() != b.length())
            for(int i = 0; i <= Math.abs(a.length() - b.length()); i++){
                if(a.length() > b.length())
                    b.insert(0, "0");
                else
                    a.insert(0, "0");
            }

        //main operation
        int res ,carry = 0;
        StringBuilder result = new StringBuilder();
        for(int i = a.length()-1;i >= 0;i--){
            res = Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i))) + carry;
            if(res >= 2) {
                res %= 2;
                carry = res + 1;
            }
            result.insert(0, res);
        }
        if (carry >= 2)
            result.insert(0, carry / 2);
        else
            result.insert(0, carry);

        System.out.println(result);
    }
}


