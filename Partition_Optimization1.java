package Chapter2;

import java.util.ArrayList;
import java.util.Collections;

public class Partition_Optimization1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(0);ar.add(1);ar.add(0);ar.add(2);ar.add(2);ar.add(0);
        ar.add(1);ar.add(2);ar.add(1);ar.add(0);ar.add(1);ar.add(2);
        System.out.println("Array : "+ar);
        dutchFlagPartition(1,ar);
        System.out.println("After 3-way partitioning  : "+ar);

    }

    public static void dutchFlagPartition(int pivotIndex, ArrayList<Integer> ar){
        int pivot = ar.get(pivotIndex);
        for(int i = 0;i < ar.size();i++)
            for(int j = i+1;j < ar.size();j++)
                if(ar.get(j) < pivot) {
                    Collections.swap(ar, i, j);
                    break;
                }

        for(int i = ar.size() - 1;i >= 0 && ar.get(i) >= pivot;--i)
            for(int j = i - 1; j >= 0 && ar.get(j) >= pivot;--j)
                if(ar.get(j) > pivot) {
                    Collections.swap(ar, i, j);
                    break;
                }
    }
}
