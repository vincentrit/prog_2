package Appenix_L;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Locales {
    public static void main(String[] args){
        Locale[] loc = Locale.getAvailableLocales();

        Arrays.stream(loc)
                .map(Locale::getDisplayCountry)
                .sorted(Comparator.reverseOrder())
                .filter(s -> !s.isEmpty())
                .distinct()
                .forEach(System.out::println);

    }
}
