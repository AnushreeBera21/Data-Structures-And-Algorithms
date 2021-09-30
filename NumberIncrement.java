package Chapter2;

import java.util.Scanner;
/*
Write a program which takes as input an array of digits encoding a decimal number
D and updates the array to represent the number D + 1. For example, if the input
65is (1,2,9) then you should update the array to (1,3,0). Your algorithm should work
even if it is implemented in a language that has finite-precision arithmetic.
 */
public class NumberIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input
        int num = sc.nextInt();
        int []ar = new int[Integer.toString(num).length() + 1];
        int i = ar.length - 1;
        while(num != 0){
            ar[i] = num % 10;
            num /= 10;
            --i;
        }

        // main operation
        ar[ar.length - 1] += 1;
        for(int j = ar.length - 1; j > 0 && ar[j] == 10;j--){
            ar[j] = 0;
            ar[j - 1] += 1;
        }

        //for output
        for(int k = ar[0] == 0 ? 1 : 0 ; k < ar.length;k++){
            System.out.print(ar[k]+"");
        }
    }

}
