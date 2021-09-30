package Chapter1;

// kinda important
public class SetAndClearABit {
    public static void main(String[] args) {
        clear(10,10);
    }
    public static void set(int num,int position,int set_bit){
        System.out.println("Before setting : "+Integer.toBinaryString(num));
        num |= (1 << position);
        System.out.println("After Setting : "+Integer.toBinaryString(num));
    }

    public static void clear(int num,int position){
        System.out.println("Before setting : "+Integer.toBinaryString(num));
        num &= ~(1 << position);
        System.out.println("After Setting : "+Integer.toBinaryString(num));
    }

    public static void toggle(int num,int position){
        System.out.println("Before setting : "+Integer.toBinaryString(num));
        num ^= (1 << position);
        System.out.println("After Setting : "+Integer.toBinaryString(num));
    }
}
