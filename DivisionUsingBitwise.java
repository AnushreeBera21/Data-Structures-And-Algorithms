package Chapter1;

import java.util.Scanner;

public class DivisionUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(b == 0){
            System.out.println("Divisor cant be 0");
            System.exit(0);
        }

        int q = 0;
        boolean sign = (a ^ b) > 0;
        a = Math.abs(a); b = Math.abs(b);

        for(int i = 0; a >=b ; i++){
            if((b << i) > a){
                q |= (1 << (i-1));
                a -= (b << (i-1));
                i = -1;
            }
        }
        System.out.println(sign ? q : -q);

    }
}
