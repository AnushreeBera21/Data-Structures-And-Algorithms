package Chapter2;

import java.util.Scanner;

public class CountTheOccurrenceOfAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []ar = new int[10];
        for(int i = 0;i < ar.length; i++)
            ar[i] = sc.nextInt();
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        // naive approach :
        int count = 0;
        for (int j : ar)
            if (j == key)
                ++count;
        System.out.println("Occurrence : "+count);

    }
}
