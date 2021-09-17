package com.collection;

import java.util.Arrays;

public class ArraySumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(1)));
        System.out.println(Arrays.toString(arraySumToZero(2)));
        System.out.println(Arrays.toString(arraySumToZero(0)));
    }

    public static int[] arraySumToZero(int N) {
        // write your code in Java SE 8
        if(N==1){
            return  new int[]{0};
        }
        int num = N/2;
        int[] res = new int[N];
        int index=0;
        while(num>0){
            res[index++]=num;
            res[index++]=num *-1;
            num--;
        }
        if(N%2!=0){
            res[res.length-1]=0;
        }
        return res;
    }
}
