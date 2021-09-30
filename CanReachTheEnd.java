package Chapter2;
/*
Write a program which takes an array of n integers, where A[i] denotes the maximum
you can advance from index i, and returns whether it is possible to advance to the
last index starting from the beginning of the array.
*/
public class CanReachTheEnd {
    public static void main(String[] args) {
        int []test1 = {3,3,1,0,2,0,1};
        System.out.println(canAdvance(test1));

        int []test2 = {3,2,0,0,2,0,1};
        System.out.println(canAdvance(test2));

        int []test3 = {2,4,1,1,0,2,3};
        System.out.println(canAdvance(test3));

        int []test4 = {2,3,1,1,4};
        System.out.println(canAdvance(test4));


    }

    public static boolean canAdvance(int []ar){
        int reachSoFar = 0, lastIndex = ar.length - 1;
        for(int i = 0; i <= reachSoFar && reachSoFar < lastIndex;i++)
            reachSoFar = Math.max(reachSoFar,i + ar[i]);
        return reachSoFar >= lastIndex;
    }
}
