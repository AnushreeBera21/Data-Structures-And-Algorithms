package Chapter3;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindromic(str));
    }

    public static boolean isPalindromic(String str){
        if(str.length() == 0 || str.length() == 1)
            return true;
        else if(str.charAt(0) == str.charAt(str.length() -1 ))
            return isPalindromic(str.substring(1,str.length() - 1));
        return false;
    }
}
