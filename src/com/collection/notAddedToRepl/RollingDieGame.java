package com.collection.notAddedToRepl;

import java.util.Random;

public class RollingDieGame {
    //Let's create a game where we roll a die, and move a player around a game board.
//The board has 40 spaces, arranged in a circle
//
//The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
//- roll the die (each die has a random value, 1-6)
//- print player start position, die value, and ending position
//
//sample output:
//
//    //     start=0, roll=3, end=3
//    //     start=3, roll=2, end=5
//    //     ...
////     start=38, roll=6, end=4
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            int roll = 1 + random.nextInt(6);
            start %= 40;
            end = start + roll;
            end %= 40;

            System.out.print("start=" + start);
            System.out.print(" roll=" + roll);
            System.out.print(" end=" + end);

            start = end;
            System.out.println();
        }
    }
}
