package Appendix_K;

import java.util.function.Function;

public class MethodReferencesMain {

    public static String applyTransformation(String value, StringTransformation stringTransformation) {
        return stringTransformation.transform(value);
    }

    public static void main(String[] args) {
        final String demoString = " Hello, World! ";
        System.out.println(applyTransformation(demoString, s -> s.toLowerCase().trim()));
    }

}
