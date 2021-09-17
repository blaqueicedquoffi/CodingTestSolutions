package com.collection;



import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print(rows+" ");
                ++k;
            }

            System.out.println();
        }
    }
}
