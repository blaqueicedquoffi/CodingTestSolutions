package com.collection;

public class ExpenseRelocation {
    public static void main(String[] args) {
        int[] a={10,-10,-1,-1,10};
        int[] b={-1,-1,-1,1,1,1,1};
        int[] c={5,-2,-3,1};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));

    }
    public static int solution(int[] arr){
        int sum=0;
        int relocations=0;
        int counter=0;
        for (int i = 1; i < arr.length-counter ; i++) {
            sum+=arr[i-1+counter]+arr[i+counter];
                if(arr[i-1]<0 ||sum<0){
                    relocations++;
                    counter++;

                }
        }
        return relocations;
    }

}
