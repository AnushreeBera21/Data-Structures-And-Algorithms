package Chapter3;

import java.util.Scanner;

public class ReverseAStringWithSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));

    }
    public static String reverse(String str){
        String []strArray = str.split(" ");
        String temp;
        for(int i = 0 ; i < strArray.length / 2;i++){
            temp = strArray[i];
            strArray[i] = strArray[strArray.length - i - 1];
            strArray[strArray.length - i - 1] = temp;
        }
        temp = "";
        for(String st: strArray)
            temp += st + " ";
     return temp;
    }
}
