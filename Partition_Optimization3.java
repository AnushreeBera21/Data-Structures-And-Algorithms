package Chapter2;

import java.util.ArrayList;
import java.util.Collections;

public class Partition_Optimization3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(0);ar.add(1);ar.add(0);ar.add(2);ar.add(2);ar.add(0);
        ar.add(1);ar.add(2);ar.add(1);ar.add(0);ar.add(1);ar.add(0);
        System.out.println("Array : "+ar);
        partition(3,ar);
        System.out.println("After 3-way partitioning  : "+ar);
    }

    public static void partition(int pivotIndex, ArrayList<Integer> ar){
        int pivot = ar.get(pivotIndex);
        int low = 0,mid = 0, high = ar.size();
        while(mid < high){
            if(ar.get(mid) < pivot)
                Collections.swap(ar, low++, mid++);
            else if(ar.get(mid) == pivot)
                ++mid;
            else
                Collections.swap(ar,mid,--high);
        }
    }
}
