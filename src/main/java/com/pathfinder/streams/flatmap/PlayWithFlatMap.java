package com.pathfinder.streams.flatmap;

import java.util.*;
import java.util.stream.Collectors;

public class PlayWithFlatMap{
    public static void main(String[] args){
        List<Integer> al1 = Arrays.asList(1,2,3,4,5);
        List<Integer> al2 = Arrays.asList(6,7,8,9,10);
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(al1);
        listOfLists.add(al2);
        final List<Integer> collect = listOfLists.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5,10,15,20));
        Set<Set<Integer>> setOfSets = new HashSet<>();
        setOfSets.add(set);
        setOfSets.add(set2);
        final List<Integer> collect1 = setOfSets.stream().flatMap(Set::stream).distinct().collect(Collectors.toList());
        System.out.println(collect1);

        final List<Integer> integers = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5));
        System.out.println(integers);
        integers.add(6);
        System.out.println(integers);
        //Collections.copy(new ArrayList<>(),Arrays.asList(1,2,3,4,5));


    }
}
