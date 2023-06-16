package Appenix_L;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class StreamOfInteger {
    public static void main(String[] args){
        int[] ints = {2, -4, 10, 45, 99, 199, -5};

        int[] newInts = IntStream.of(ints)
                .map(Math::abs)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int x : newInts) System.out.println(x);
    }
}
