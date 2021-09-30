package Chapter3;

import java.util.Scanner;

public class SinusoidalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(formatter(sc.nextLine()));
    }

    public static String formatter(String s){
        StringBuilder result = new StringBuilder();
        for(int i = 1 ; i < s.length();i += 4)
            result.append(s.charAt(i));

        for(int i = 0;i < s.length();i+=2)
            result.append(s.charAt(i));

        for(int i = 3 ;i < s.length();i += 4)
            result.append(s.charAt(i));
        return result.toString();
    }
}
