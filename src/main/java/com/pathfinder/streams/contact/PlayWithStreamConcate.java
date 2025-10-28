package com.pathfinder.streams.contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayWithStreamConcate{
    public static void main(String[] args){

        // Add two list and print the combined list
        List<Integer> al1= Arrays.asList(1,2,3,4,5);
        List<Integer> al2= Arrays.asList(6,7,8,9,10,3,4,5);
        List<Integer> al3= Arrays.asList(16,17,18,19,20,3,4,5);

        final List<Integer> collect = Stream.concat(al1.stream(),al2.stream()).collect(Collectors.toList());
        System.out.println(collect);

        // remove duplicates from two list
        System.out.println("----------remove duplicates from two list-----------");
        Stream.concat(al1.stream(),al2.stream())
              .distinct().forEach(System.out::println);

        // combined two or more list and remove duplicates
        System.out.println("----------combined two or more list and remove duplicates-----------");
        Stream.concat(Stream.concat(al1.stream(),al2.stream()),al3.stream())
              .distinct().forEach(System.out::println);

        // combine two string and remove duplicates
        System.out.println("--------combine two string and remove duplicates-------------");
        String st1= "ashu";
        String st2= "asha";
        Stream.concat(st1.chars().mapToObj(a ->(char) a), st2.chars().mapToObj(b -> (char) b))
                .distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
