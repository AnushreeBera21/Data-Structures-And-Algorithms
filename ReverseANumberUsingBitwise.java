package Chapter1;


import java.util.Scanner;

public class ReverseANumberUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Integer.toBinaryString(a));
        int rev = 0;
        while(a > 0){
            rev = rev << 1;
            if ((a & 1) == 1)
                rev = rev ^ 1;
            a = a >> 1;
        }

//      StringReverse Method
//        StringBuilder s = new StringBuilder(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(rev));
    }
}
