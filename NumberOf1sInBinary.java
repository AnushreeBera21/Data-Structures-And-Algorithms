package Chapter1;

public class NumberOf1sInBinary {
    public static void main(String[] args) {
        int x = 10,sum = 0;

        // naive approach
       /* while(x != 0){
            sum += (x & 1);
            x = x>> 1;
        }
        System.out.println(sum);

        */

        // Brian's algorithm
        while(x > 0){
            x &= (x-1);
            ++sum;
        }
        System.out.println(sum);
    }
}
