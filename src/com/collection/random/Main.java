package com.collection.random;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(replace("Myname","MYLETTERS"));
    }
    static String replace(String name,String replacement){
        boolean replaced=false;
        String lowerName=name.toLowerCase();
        String newStr="";
        for (int i = 0; i < name.length(); i++) {
            char letter=lowerName.charAt(i);
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                newStr+=letter;
            }else {
                if(!replaced){
                    newStr+=replacement;
                    replaced=true;
                }else{
                    newStr+=letter;
                }

            }
        }

        return newStr;
    }
}
