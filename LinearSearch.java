package Chapter2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ar = new int[10];
        for(int i = 0;i < ar.length; i++)
            ar[i] = sc.nextInt();
        System.out.print("Enter key : ");
        int key = sc.nextInt();

        // naive approach :
        for(int j = 0;j < ar.length; j++)
            if (ar[j] == key) {
                System.out.println("Element found at the index : " + j);
                System.exit(0);
            }
        System.out.println("Element not found");

    }
}
