package Chapter1;

import java.util.Scanner;

public class SwapBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        swap(10,2,3);

    }

    public static void swap(int a,int i,int j){
         if(i == j) {
             System.out.println(Integer.toBinaryString(a));
             System.exit(0);
         }
         System.out.println("Before Swapping");
         System.out.println(Integer.toBinaryString(a));
         int bit1 =  (a >> i) & 1;
         int bit2 =  (a >> j) & 1;
         if(bit1 != bit2) {
             int x = (bit1 ^ bit2);
             x = (x << i) | (x << j);
             a = a ^ x;
         }
        System.out.println("After Swapping");
        System.out.println(Integer.toBinaryString(a));
    }
}
