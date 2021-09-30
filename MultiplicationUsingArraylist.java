package Chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a program that takes two arrays representing integers, and returns an integer representing their product.
////For example, since , 193707721 X -761838257287 = -147573952589676412927, if the inputs are
//66(1,9, 3, 7, 0,7, 7, 2,1} and (-7,6, 1,8, 3,8, 2, 5, 7, 2, 8, 7), your function should return
//(-1, 4, 7, 5, 7, 3, 9, 5, 2, 5, 8, 9, 6, 7, 6, 4,1, 2, 9, 2, 7).
public class MultiplicationUsingArraylist {
    public static void main(String[] args) {
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        num1.add(9);num1.add(3);num1.add(5);
        num2.add(2);num2.add(4);num2.add(7);
        for(Integer i : multiply(num1,num2))
            System.out.print(i+"");
    }

    public static List<Integer> multiply(List<Integer> a, List<Integer> b){
        int sign = (a.get(0) ^ b.get(0)) > 0 ? 1 : -1;
        a.set(0,Math.abs(a.get(0)));
        b.set(0,Math.abs(b.get(0)));

        List<Integer> result = new ArrayList<>(Collections.nCopies(a.size() + b.size(),0));
        for(int i = a.size() - 1; i >= 0;--i){
            for(int j = b.size() - 1; j >= 0; --j){
                result.set(i+ j + 1 ,result.get(i + j + 1) + a.get(i) * b.get(j));
                result.set(i + j,result.get(i + j) + result.get(i + j + 1) / 10);
                result.set(i + j + 1, result.get(i + j + 1) % 10);
            }
        }

        int first_not_zero = 0;
        while(first_not_zero < result.size() && result.get(first_not_zero) == 0){
            ++first_not_zero;
        }
        result = result.subList(first_not_zero,result.size());
        if(result.isEmpty())
            return Collections.singletonList(0);
        result.set(0, result.get(0) * sign);
        return result;


    }
}
