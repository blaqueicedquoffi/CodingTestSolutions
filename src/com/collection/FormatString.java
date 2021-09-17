package com.collection;

import java.util.ArrayList;

public class FormatString {
    public static void main(String[] args) {


        String input="00-44   48 ^%& 555555";
        System.out.println(solution(input));

    }
    public static String solution(String S){

        String newStr=S.replaceAll("[^0-9]","");


        ArrayList<Character> arrayList=new ArrayList<>();
        int counter=0;
        boolean flag=newStr.length()%3==1;
        for (int i = 0; i < S.length(); i++) {
            if(Character.isDigit(S.charAt(i))){
                if(flag&& S.length()-i==2){
                    arrayList.add('-');
                }
                arrayList.add(S.charAt(i));
                counter++;
                if(counter==3){
                    if(!(flag&& S.length()-i==2)){
                        arrayList.add('-');
                    }

                    counter=0;
                }
            }

        }
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0, arrayListSize = arrayList.size(); i < arrayListSize; i++) {
            Character s = arrayList.get(i);
            if (Character.isDigit(s) || s == '-') {
                    if (!(s == '-' && i==arrayList.size()-1)){
                        stringBuilder.append(arrayList.get(i));
                    }


            }
        }
      return stringBuilder.toString();
    }
}
