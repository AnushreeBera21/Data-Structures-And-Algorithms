package Chapter2;

import java.util.Scanner;

/*
Given an array A of n elements and a permutation P, apply P to A.
 */
public class ApplyPermutation {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []A = new int[size];
        int []P = new int[size];
        System.out.print("Enter array : ");
        for(int i = 0; i < size;i++){
            A[i] = sc.nextInt();
        }
        System.out.print("Enter permutation : ");
        for(int i = 0; i < size;i++){
            P[i] = sc.nextInt();
        }

        for(int i : P){
            System.out.print(A[i]+" ");
        }


    }
}
