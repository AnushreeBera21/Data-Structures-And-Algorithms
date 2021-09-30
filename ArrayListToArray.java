package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.print("Enter the size of array : ");int size = sc.nextInt();
        for(int i = 0 ;i < size ;i++)
            ar.add(sc.nextInt());

        Object[] arr = ar.toArray();
        for(Object i : arr)
            System.out.println(i);

    }
}
