package com.collection.filtermapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {
    public static Predicate<String> nameStartingWithPrefix(String nextLine) {
        return new Predicate<String>() {

            @Override
            public boolean test(String t) {
                // System.out.println(t);
                return t.startsWith(nextLine);
            }
        };
    }
}
