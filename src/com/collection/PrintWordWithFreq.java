package com.collection;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class PrintWordWithFreq {
    public static void main(String[] args) {

        System.out.println(prCharWithFreq("HelLol"));
    }
    public static String prCharWithFreq(String s)
    {
        s=s.toLowerCase(Locale.ROOT);
        StringBuilder newStr = new StringBuilder();
        Map<Character, Integer> d = new TreeMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(d.containsKey(s.charAt(i)))
            {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            }
            else
            {
                d.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character,Integer> entry:d.entrySet()
             ) {
            newStr.append(String.valueOf(entry.getKey())+entry.getValue());
        }
        return newStr.toString();
    }

}
