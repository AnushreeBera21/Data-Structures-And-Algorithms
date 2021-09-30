package Chapter2;

import java.util.Scanner;

//Prime Number Generation Using trivial-division
public class PrimeNumberUptoANumber1 {
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
        for(int i = 2;i < n;i ++){
            if(n % i == 0){
                flag = 1;
                break;
            }
        }
        return flag == 0;
    }
}
