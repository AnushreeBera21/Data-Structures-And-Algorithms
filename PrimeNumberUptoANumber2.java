package Chapter2;

import java.util.Scanner;
//Prime number using square root approach
public class PrimeNumberUptoANumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 2;i < num;i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n){
        int flag = 0;
        if(n % 2 != 0 || n == 2)
            for(int i = 3 ;i < (int)Math.sqrt(n) + 1;i += 2){
                if(n % i == 0){
                    flag = 1;
                    break;
                }
            }
        else
            flag = 1;
        return flag == 0;
    }
}
