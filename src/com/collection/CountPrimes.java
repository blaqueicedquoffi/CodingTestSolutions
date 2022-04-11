package com.collection;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes("2,10"));
    }
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n>1) {
            for(int i=2;i<n;i++) {
                if(n%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
return isPrime;
    }
    public static int countPrimes(String s){
        int n=Integer.parseInt(s.split(",")[0]);
        int m=Integer.parseInt(s.split(",")[1]);
        int counter=0;
        for (int i = n; i <=m ; i++) {
            if(i>1&& isPrime(i)){
                counter++;
            }
        }
        return counter;
    }
}
