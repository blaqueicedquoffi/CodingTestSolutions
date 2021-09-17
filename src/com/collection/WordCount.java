package com.collection;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(WordCount(" a b s"));

    }

    public static String WordCount(String str) {
        // code goes here
        return String.valueOf(str.split(" ").length);
    }
}
