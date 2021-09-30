package Chapter2;

public class OddEvenDistribute2 {
    public static void main(String[] args) {
        int []ar = {1,3,5,6,81,42,15,72};
        int temp;
        int j = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                j++;
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        System.out.println("After segregation : ");
        for (int value : ar)
            System.out.print(value + " ");
    }
}
