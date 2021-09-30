package Chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Prime number using sieve of Eratosthenes
//Time Complexity : 0(n log log n)
//Space Complexity : 0(n)
public class PrimeNumberUsingSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Boolean> isPrime  = new ArrayList<>(Collections.nCopies(num + 1,true));
        isPrime.set(0,false);
        isPrime.set(1,false);
        for(int i = 2;i <= num;i++){
            if(isPrime.get(i)) {
                primes.add(i);
                for(int j = i ; j <= num; j += i)
                    isPrime.set(j, false);
            }
        }

        System.out.println(primes);
    }


}
