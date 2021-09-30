package Chapter3;

import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt(),b2 = sc.nextInt();
        String str = sc.next();
        System.out.println(convert(b1,b2,str));

    }

    public static String convert(int b1,int b2,String str){
        int temp = 0,j = str.length();
        boolean isNegative = str.startsWith("-");
        if(isNegative)
            str = str.substring(1);

        for(int i = 0; i < str.length() && j >= 0; ++i) {
            --j;
            temp = (str.charAt(i) - '0') * (int) Math.pow(b1, j) + temp;
        }
        StringBuilder res = new StringBuilder();
        while(temp != 0){
            if(temp % b2 >= 10){
                res.insert(0, (char) (temp % b2 - 10 + 'A'));
            }
            else
                res.insert(0, temp % b2);
            temp /= b2;

        }
        return isNegative ? "-" + res : res.toString();
    }
}
