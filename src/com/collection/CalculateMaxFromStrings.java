package com.collection;

import javax.sound.sampled.Line;
import java.util.*;

public class CalculateMaxFromStrings {
    public static void main(String[] args) {
String S="id,name,age,act,room,dep.\n1,jack,68,T,13,8,\n17,Betty,28,F,15,7";
String C="age";

        System.out.println(solution(S,C));
    }

    public static int solution(String S,String C){
        String[] arr =S.split("\n");
        int max=Integer.MIN_VALUE;
        for (int i=1;i<arr.length;i++
             ) {
            String[] line=arr[i].split(",");
            String[] header=arr[0].split(",");
            for (int j = 0; j < header.length; j++) {
                if(header[j].replace(".","").equals(C)){
                    if(Integer.parseInt(line[j])>max){
                        max=Integer.parseInt(line[j]);
                    }
                }

            }

        }

        return max;
    }
}
