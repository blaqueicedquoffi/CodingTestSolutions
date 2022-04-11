package com.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class AnaGrams
{
    // Function to group anagrams from a given list of words
    public static int groupAnagrams(List<String> words)
    {
        List<String> laterUse=new ArrayList<>(words);
        // a set to store anagrams
        Set<Set<String>> anagrams = new HashSet<>();

        // base case
        if (words == null) {
            return 0;
        }

        // sort each word on the list
        List<String> list = words.stream()
                .map(s -> Stream.of(s.split("")).sorted()
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());

        // construct a map where the key is each sorted word,
        // and value is a list of indices where it is present
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++)
        {
            map.putIfAbsent(list.get(i), new ArrayList<>());
            map.get(list.get(i)).add(i);
        }

        // traverse the map and read indices for each sorted key.
        // The anagrams are present in the actual list at those indices
        for (Map.Entry<String,List<Integer>> entry: map.entrySet())
        {
            Set<String> collection = entry.getValue().stream()
                    .map(words::get)
                    .collect(Collectors.toSet());
            if (collection.size() > 1) {
                anagrams.add(collection);
            }
        }

        int counter=0;
        ArrayList<String> wordsToBeRemoved=new ArrayList<>();
        for (Set<String> seto:anagrams
             ) {
            counter++;
            wordsToBeRemoved.addAll(seto);
        }
        laterUse.removeAll(wordsToBeRemoved);
        counter=counter+laterUse.size();

        return counter;
    }

    public static void main(String[] args)
    {
        // list of words
        List<String> words = Arrays.asList("cat","listen","silent","kitten","salient");

        System.out.println( groupAnagrams(words));


    }
}