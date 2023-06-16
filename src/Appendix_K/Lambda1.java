package Appendix_K;

import java.util.Arrays;
import java.util.Objects;

public class Lambda1 {
    public static void main(String[] args){
        Object[] potentialIntegers = {"1", '4', null, 6, "", ' '};

        Arrays.stream(potentialIntegers)
                .filter(Objects::nonNull)
                .map(Object::toString)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
