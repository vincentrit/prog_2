package Appendix_K;

import java.util.function.Function;

public class MethodReferencesMain2 {

    public static String applyTransformation(String value, Function<String, String> function) {
        return function.apply(value);
    }

    public static void main(String[] args) {
        final String demoString = " Hello, World! ";
        System.out.println(applyTransformation(demoString, s -> s.toLowerCase().trim()));
    }

}
