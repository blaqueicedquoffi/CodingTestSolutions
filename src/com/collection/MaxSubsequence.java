package com.collection;

import java.util.ArrayList;
import java.util.List;

public class MaxSubsequence {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(13);
        list.add(2);

        System.out.println(maxSequence(list));
    }
    public static int maxSequence(List<Integer> tickets){

        int n=tickets.size();
        int[] newArr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++){
            newArr[i] = 1;}

        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (Math.abs(tickets.get(i) - tickets.get(j)) <= 1
                        && newArr[i] < newArr[j] + 1){
                    newArr[i] = newArr[j] + 1;}}}

        for (int i = 0; i < n; i++){
            if (max < newArr[i]){
                max = newArr[i];}}
        return max;
    }
}
