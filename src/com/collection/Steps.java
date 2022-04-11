package com.collection;

public class Steps {
    public static void main(String[] args) {
        System.out.println(MinimumMoves(20));
    }
    public static int MinimumMoves(int N)
    {
        int x=0;
        int steps=0;
        while(true){
            if(x>=N){
                break;
            }
            x++;
            steps++;
            if(x>=N){
                break;
            }
            x=x*2;
            steps++;
            if(x>=N){
                break;
            }
        }
        return steps;
    }
}
