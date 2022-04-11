package com.collection;

import java.util.regex.Pattern;

public class SimplePassword {
    public static void main(String[] args) {
        System.out.println(SimplePassword("password123!!!!"));
        System.out.println(SimplePassword("turkey90AAA="));
    }

    public static String SimplePassword(String str){

        if(str.replaceAll("[A-Z0-9]","").equals(str)){
            return "false";
        }else if(str.replaceAll("^[A-Za-z0-9]","").equals(str)){
            return "false";
        }else if(str.toLowerCase().contains("password")){
            return "false";
        }else if(str.length()<=7 || str.length()>=31){
            return "false";
        }else {
            return "true";
        }

    }
}
