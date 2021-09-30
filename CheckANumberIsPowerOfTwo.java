package Chapter1;

import java.util.Scanner;

public class CheckANumberIsPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //naive approach
        int flag = 0;
        while(n > 2){
            if(n % 2 != 0){
                flag = 1;
                break;
            }
            n /= 2;
        }
        System.out.println(flag == 0 ? "Yes" : "No");
    }
}
