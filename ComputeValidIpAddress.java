package Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputeValidIpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(computeValidIP(sc.next()));
    }

    public static ArrayList<String> computeValidIP(String s){
        ArrayList<String> ar = new ArrayList<>();
        String first,second,third,fourth;
        for(int i = 1 ;i < 4 && i < s.length();i++){
            first = s.substring(0,i);
            if(isValid(first)){
                for(int j = 1;j < 4 && j + i < s.length();j++){
                    second = s.substring(j,i+j);
                    if(isValid(second)){
                        for(int k = 1;k < 4 && k + j + k< s.length();k++){
                            third = s.substring(i + j, i+j+k);
                            fourth = s.substring(i+j+k,s.length());
                            if(isValid(third) && isValid(fourth))
                                ar.add(first + "." + second + "." + third + "." + fourth);
                        }
                    }
                }
            }
        }
        return ar;
    }

    public static boolean isValid(String s){
        if(s.length() > 3)
            return false;
        if(s.startsWith("0") && s.length() > 1)
            return false;
        return Integer.parseInt(s) >= 0 && Integer.parseInt(s) <= 255;

    }

}
