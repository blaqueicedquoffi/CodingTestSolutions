package com.collection;

import java.util.Arrays;
import java.util.List;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        /*Collections.sort(list);
        return list.get(list.size()-1) +list.get(list.size()-2);*/
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;

        for (Integer integer : list) {
            if (firstNum < integer) {
                secondNum = firstNum;
                firstNum = integer;
            } else if (secondNum < integer) {
                secondNum = integer;
            }
        }

        return firstNum+secondNum;
        }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list));
    }
}
