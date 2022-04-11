package com.collection;

import java.util.*;

public class CountDuplicatesList {
    public static void main(String[] args) {
List<Integer> list1=new ArrayList<>();
list1.add(13);
        list1.add(12);
       list1.add(13);
        list1.add(15);
        list1.add(12);
        list1.add(12);
        System.out.println(duplicate1(list1));
    }

    static int duplicate(List<Integer> numbers){

        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if(i!=j && numbers.get(i)==numbers.get(j)){
                  set.add(numbers.get(i));
                }
            }
        }
        return set.size();
    }
    static int duplicate1(List<Integer> numbers){
        Map<Integer, Integer> map
                = new LinkedHashMap<Integer, Integer>();
        for (Integer number : numbers) {
            try {
                map.put(number, map.get(number) + 1);
            } catch (Exception e) {
                map.put(number, 1);
            }
        }
        int counter=0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                counter++;
            }
        }
        return counter;
    }
}
