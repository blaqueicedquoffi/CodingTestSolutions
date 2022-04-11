package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Platformer {
    int n;
    int position;
    List<Integer> tiles=new ArrayList<>();


    public Platformer(int n, int position) {
        this.n = n;
        this.position = position;
        for (int i = 0; i < n; i++) {
            tiles.add(i);

        }

    }

    public void jumpLeft() {
        tiles.remove(n-1);
    }
    public void jumpRight() {
        tiles.remove(n+1);
    }
    public int position() {
     return tiles.get(n);
    }
    public static void main(String[] args) {
        Platformer platformer = new Platformer(6, 3);
        System.out.println(platformer.position()); // should print 3
        platformer.jumpLeft();
        System.out.println(platformer.position()); // should print 1
        platformer.jumpRight();
        System.out.println(platformer.position()); // should print 4
    }
}
