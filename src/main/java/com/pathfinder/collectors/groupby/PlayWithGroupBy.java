package com.pathfinder.collectors.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlayWithGroupBy{
    public static void main(String[] args){


        // group by first letter of the string
        // it will return a map with key as first letter and value as list of strings
        List<String > al = Arrays.asList("ashu","asha","ankit","ankur","aman","bob","barry","bobby");
        final Map<String, Integer> collect = al.stream().collect(Collectors.toMap(Function.identity(),String::length,(existing,replacement) -> existing));
        System.out.println(collect);

    }
}
