package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteFromArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> ar = new ArrayList<>();
        System.out.print("Enter the size of array : ");int size = sc.nextInt();
        for(int i = 0 ;i < size ;i++)
            ar.add(sc.nextDouble());
        System.out.println("Your array : "+ar);

//  For one element removal :
//        System.out.print("Enter an element to delete : ");
//        ar.remove(sc.nextDouble());

//  For all elements removal :
        ar.clear();
        System.out.println("Your array becomes : "+ar);
    }




}
