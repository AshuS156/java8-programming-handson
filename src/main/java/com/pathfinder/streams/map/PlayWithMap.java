package com.pathfinder.streams.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayWithMap{
    public static void main(String[] args){
        // map function is used to transform the elements of a stream
        // it takes a function as a parameter and applies that function to each element of the stream
        // it returns a new stream with the transformed elements
        List<String> al = Arrays.asList("ashu","asha","ankit","ankur","aman");
        final List<Integer> collect = al.stream().map(e -> {
            return e.length();
        }).collect(Collectors.toList());
        System.out.println(collect);

    }
}
