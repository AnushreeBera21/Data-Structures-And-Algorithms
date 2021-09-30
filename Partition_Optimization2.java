package Chapter2;

import java.util.ArrayList;
import java.util.Collections;

public class Partition_Optimization2 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(0);ar.add(1);ar.add(0);ar.add(2);ar.add(2);ar.add(0);
        ar.add(1);ar.add(2);ar.add(1);ar.add(0);ar.add(4);ar.add(8);
        System.out.println("Array : "+ar);
        partition(1,ar);
        System.out.println("After 3-way partitioning  : "+ar);
    }

    public static void partition(int pivotIndex, ArrayList<Integer> ar){
        int pivot = ar.get(pivotIndex);
        int smaller = 0;
        for(int i = 0;i < ar.size();i++)
            if(ar.get(i) < pivot)
                Collections.swap(ar, smaller++, i);

        int larger = ar.size() - 1;
        for (int j = ar.size() - 1; j >= 0 && ar.get(j) >= pivot; --j)
            if (ar.get(j) > pivot)
                Collections.swap(ar, larger--, j);

    }
}
