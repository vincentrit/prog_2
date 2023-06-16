package Appendix_J;

import java.lang.reflect.*;

public class Decompiler {

    public String decompile(Class<?> clazz) {
        StringBuilder stringBuilder = new StringBuilder(getClassInfo(clazz)).append("{");

        /* iterate over all constructors and add them to the output string */
        // TODO

        /* iterate over all fields and add them to the output string */
        // TODO

        /* iterate over all methods and add them to the output string */
        // TODO

        /* finalize class body */
        stringBuilder.append("\n}");

        /* return aggregated representation of class */
        return stringBuilder.toString();
    }

    protected String getClassInfo(Class<?> clazz) {
        StringBuilder stringBuilder = new StringBuilder(); // TODO

        return stringBuilder.toString();
    }

    protected String getFieldInfo(Field field) {
        StringBuilder stringBuilder = new StringBuilder();

        // TODO

        return stringBuilder.toString();
    }

    protected String getConstructorInfo(Constructor<?> constructor) {
        StringBuilder stringBuilder = new StringBuilder();

        // TODO

        /* return final string */
        return stringBuilder.toString();
    }

    protected String getMethodInfo(Method method) {
        StringBuilder stringBuilder = new StringBuilder();

        // TODO

        return stringBuilder.toString();
    }
}
