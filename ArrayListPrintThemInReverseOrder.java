package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrintThemInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.print("Enter the size of array : ");int size = sc.nextInt();
        for(int i = 0 ;i < size ;i++)
            ar.add(sc.nextInt());
        System.out.print("Array lis tin reverse order");
        for(int i = ar.size() - 1 ; i >= 0;i--)
            System.out.println(ar.get(i));
    }
}
