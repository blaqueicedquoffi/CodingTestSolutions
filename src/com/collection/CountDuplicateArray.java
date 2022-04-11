package com.collection;

import java.lang.reflect.Array;
import java.util.*;

public class CountDuplicateArray {
    public static void main(String[] args) {
       int[] arr={1,2,2,2,3};
        int[] arr2={0,-2,-2,5,5,5};
        int[] arr3={100,2,101,4};
        System.out.println(DistinctList(arr));
        System.out.println(DistinctList(arr2));
        System.out.println(DistinctList(arr3));
    }
    public static int DistinctList(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int number:arr
             ) {
            list.add(number);
        }
        Set<Integer> set=new HashSet<>(list);
        return list.size()- set.size();
    }
}
