package Chapter1;



public class SwapNumberUsingBitwise {
    public static void main(String[] args) {
        int a = 10,b = 23;
        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
