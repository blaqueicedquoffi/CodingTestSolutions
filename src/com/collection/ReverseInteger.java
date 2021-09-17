package com.collection;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(reverseInteger(54321));
        System.out.println(reverseInteger(654));
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(789));
    }
    public  static int reverseInteger(int N){
        String number=String.valueOf(N);
        StringBuilder stringBuilder=new StringBuilder(number);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
        }
    }

