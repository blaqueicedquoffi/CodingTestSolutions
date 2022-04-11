package com.collection.zack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void main(String[] args)
    {
        ArrayList<String> words=new ArrayList<>();
        String str = "king";
        for (int i = 1; i <=str.length() ; i++) {
            generatePermutation(words,str.substring(0,i), 0, str.substring(0,i).length());
        }
        System.out.println(words);
    }

    //Function for generating different permutations of the string
    public static void generatePermutation(ArrayList<String> words,String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1){
        if(Dictionary.isEnglishWord(str)){
            words.add(str);
        }

        }
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(words,str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }
}
