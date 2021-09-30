package Chapter2;
import java.util.Scanner;

public class OddEvenDistribute1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ar = new int[5];
        int[] even = new int[ar.length];
        int[] odd = new int[ar.length];

        int j = 0, k = 0;
        for(int i = 0 ;i < ar.length;i++) {
            ar[i] = sc.nextInt();
            if(ar[i] % 2 == 0) {
                even[j] = ar[i];
                ++j;
            }
            else {
                odd[k] = ar[i];
                ++k;
            }
        }

        System.out.print("Original array : ");
        for (int value : ar)
            System.out.print( + value + " ");

        System.out.print("Even numbers : " );
        for (int value : even)
            System.out.print(value + " ");

        System.out.print("Odd numbers : " );
        for (int value : odd)
            System.out.print(value + " ");

    }
}
