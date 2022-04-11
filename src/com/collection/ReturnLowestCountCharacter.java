package com.collection;

import java.util.*;

public class ReturnLowestCountCharacter {
    public static void main(String[] args) {
        // Write a method that when given a String,
        // the method returns the first instance of the
        // character with the lowest count. E.g. if given
        // "immersion"
       // the method returns 'e' because it is the first instance
      // of a character with a count of 1, and if given "papa" the
     // method returns 'p' for the same reason
        System.out.println(returnLowestCountChar("immersion"));
        System.out.println(returnLowestCountChar("papa"));

    }
    public static char returnLowestCountChar(String s){
        char[] arr=s.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char c:arr
             ) {
            map.merge(c, 1, Integer::sum);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        return list.get(0).getKey();
    }

}
