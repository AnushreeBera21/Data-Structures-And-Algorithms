package Chapter2;

public class ReorderTrueFalse {
    public static void main(String[] args) {
        boolean []ar = {true,false,false,true,false,false,false,true,true};
        System.out.print("Before Reordering : ");
        for(boolean i : ar)
            System.out.print(i+" ");
        int j = -1;
        boolean temp;
        for(int i = 0 ;i < ar.length;i++){
            if(!ar[i]){
                ++j;
                temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        System.out.print("\nAfter Reordering : ");
        for(boolean i : ar)
            System.out.print(i+" ");

    }
}
