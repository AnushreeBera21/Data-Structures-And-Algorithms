package Chapter1;

import java.util.Scanner;

public class PowerUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt();
        System.out.println(power(x,y));

    }

    public static int power(int x,int y){  // yes mam
        if(y < 0){
            x = 1 / x;
            y = -y;
        }
        if(y == 0)
            return 1;
        else if ((y & 1) == 0)
            return power(x,y >> 1) * power(x, y >> 1);
        else
            return x * power(x,y >> 1) * power(x, y >>1);
    }
}
