package Appenix_L;

import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args){
        int[] arr = {0, 1};
        Stream.iterate(arr, t -> new int[] { t[1], t[1] + t[0]} )
                .limit(20)
                .mapToInt(s -> s[0])
                .forEach(System.out::println);
    }
}
