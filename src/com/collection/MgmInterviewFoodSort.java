package com.collection;

import java.util.Arrays;
import java.util.Comparator;

//Your task is to:
//- fix the code
//- improve the poor quality of this code (you can imagine that someone did the review of this code and that he asked you to fix it).
//
// (You can change anything you want
//
//The class should sort food instances and output the following lines:
//
//Potato 1
//Potato 9
//Potato 11
//Tomato 11
//Potato 12
//Potato 42
//Potato 46
//Potato 55
//Potato 77
//Tomato 121
//
abstract class Food {
    private final int size;
public int getSize(){
    return size;
}
    public Food(){
        this.size=-1;
    }
    public Food(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" "+size;
    }
}


class Potato extends Food {
    public Potato(){
        super();
    }
    public Potato(int size) {
        super(size);
    }
}

class Tomato extends Food {
    public Tomato() {
        super(121);
    }
    public Tomato(int size) {
        super(size);
    }
}

public class MgmInterviewFoodSort {
    public void sortFoodItems(Food[] foods) {

      Arrays.sort(foods, Comparator.comparingInt(Food::getSize));
        for ( Food food : foods) {
            System.out.println(food);
        }
    }

    public static void main(String[] args) {
       Food[] foods = new Food[]{new Tomato(11),new Tomato(),
                new Potato(1),new Potato(42),new Potato(77),new Potato(55),new Potato(46)
                ,new Potato(12),new Potato(11),new Potato(9)
        };

        MgmInterviewFoodSort mgmInterviewFoodSort=new MgmInterviewFoodSort();
        mgmInterviewFoodSort.sortFoodItems(foods);
    }

}
