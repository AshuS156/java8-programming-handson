package com.pathfinder.streams.skip;

import java.util.stream.IntStream;

public class PlayWithSkip{
    public static void main(String[] args){
        IntStream.range(0,5)
                .skip(1)
                .forEach(System.out::println);
    }
}
