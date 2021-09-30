package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar1 = new ArrayList<>();
        System.out.print("Enter elements of ar1 : ");
        for(int i = 0 ;i < 5 ;i++)
            ar1.add(sc.nextInt());
        ArrayList<Integer> ar2 = new ArrayList<>();
        System.out.print("Enter elements of ar1 : ");
        for(int i = 0 ;i < 5 ;i++)
            ar2.add(sc.nextInt());
        ar1.addAll(ar2);
    }

}
