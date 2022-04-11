package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;

public class HTMLElements {
    public static void main(String[] args) {

        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
    public static String HTMLElements(String str){

        LinkedList<String> openingTags=new LinkedList<>();
        LinkedList<String> closingTags=new LinkedList<>();
        String[] tagArray=str.split("[><]");

        for (String tag:tagArray
             ) {
            if(tag.equals("div")||tag.equals("p")||tag.equals("em")||tag.equals("i")||tag.equals("b")){
                openingTags.add(tag);
            }
            if(tag.equals("/div")||tag.equals("/p")||tag.equals("/em")||tag.equals("/i")||tag.equals("/b")){
                if(openingTags.size()!=0){
                    String openingTag=openingTags.getLast();
                    if(openingTag.equals(tag.substring(1))){
                        openingTags.removeLast();
                    }else {
                        return openingTags.getLast();
                    }
                }

            }

        }

        return "true";
    }
}
