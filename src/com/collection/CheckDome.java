package com.collection;

import java.util.ArrayList;

public class CheckDome {


    public static void main(String[] args) {

    }
    public static String HTMLElements(String str){
        ArrayList<String> open_tags=new ArrayList<>();
        open_tags.add("<b>");
        open_tags.add("<i>");
        open_tags.add("<em>");
        open_tags.add("<div>");
        open_tags.add("<p>");
        ArrayList<String> close_tags=new ArrayList<>();
        close_tags.add("</b>");
        close_tags.add("</i>");
        close_tags.add("</em>");
        close_tags.add("</div>");
        close_tags.add("</p>");
        ArrayList<String> stack=new ArrayList<>();
        String[] strArr=str.split("(<[^>]*>)");
        for (String tag : strArr){
            if(open_tags.contains(tag)){
                stack.add(tag);
            }else if(close_tags.contains(tag)){

                for (int i = 0; i < close_tags.size(); i++) {
                   if(close_tags.get(i).equals(tag)){
                       if(stack.size()>0 &&open_tags.get(i).equals(stack.get(i-1))){
                           stack.remove(0);
                       }
                   }
                }
                if(stack.size()>0){
                    return stack.get(0).replace("<","").replace(">","");
                }


            }
        }
        return "true";
    }
}
