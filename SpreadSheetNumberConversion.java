package Chapter3;

import java.util.Scanner;

/*
Implement a function that converts a spreadsheet column id to the corresponding
integer, with "A" corresponding to 1. ZZ = 26 ^ 2 + 26
 */
public class SpreadSheetNumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convertToId(sc.nextInt()));
    }
    public static int convert(String str){
        int i = 0,res = 0;
        for(Character ch : str.toCharArray()){
            res = (ch - 'A' + 1) * (int)Math.pow(26,i) + res;
            ++i;
        }
        return res;
    }

    public static String convertToId(int num) {
        String s = "";
        while(num != 0){
            System.out.println(num % 26);
            s += (char)(num % 26 + 'Z');
            num /= 26;
        }
        return s;
    }
}
