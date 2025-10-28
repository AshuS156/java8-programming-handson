package com.pathfinder.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PlayWithAggregation{
    public static void main(String[] args){

        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        final Optional<Integer> reduce = integers.stream().map(i -> i * i).reduce(Integer::sum);
        System.out.println(reduce.get());

    }
}
