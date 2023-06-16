package Appendix_J;

import java.lang.reflect.*;
import java.util.Arrays;

public class Decompiler {

    public String decompile(Class<?> clazz) throws Exception {
        StringBuilder stringBuilder = new StringBuilder(getClassInfo(clazz)).append("{");

        /* iterate over all constructors and add them to the output string */
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) stringBuilder.append("\n\t").append(getConstructorInfo(constructor));

        /* iterate over all fields and add them to the output string */
        for (Field field : clazz.getDeclaredFields()) stringBuilder.append("\n\t").append(getFieldInfo(field));

        /* iterate over all methods and add them to the output string */
        for (Method method : clazz.getDeclaredMethods()) stringBuilder.append("\n\t").append(getMethodInfo(method));

        /* finalize class body */
        stringBuilder.append("\n}");

        /* return aggregated representation of class */
        return stringBuilder.toString();
    }

    protected String getClassInfo(Class<?> clazz) {
        StringBuilder stringBuilder = new StringBuilder();
        int mods = clazz.getModifiers();


        //Checks the visibility of the class and add it to String
        if (Modifier.isPublic(mods)) stringBuilder.append("public ");
        if (Modifier.isPrivate(mods)) stringBuilder.append("private ");
        if (Modifier.isProtected(mods)) stringBuilder.append("protected ");

        //Checks if class is final
        if (Modifier.isStatic(mods)) stringBuilder.append("static ");

        //checks if class is final or abstract
        if (Modifier.isFinal(mods)) stringBuilder.append("final ");
        if (Modifier.isAbstract(mods) && !Modifier.isInterface(mods)) stringBuilder.append("abstract ");

        //checks whether it is an interface or a class
        stringBuilder.append(Modifier.isInterface(mods) ? "interface " : "class ");

        //adds the name of class / interface
        stringBuilder.append(clazz.getSimpleName()).append(" ");

        //checks if class / interface has a super class and adds it if so.
        if (clazz.getSuperclass() != null){
            stringBuilder.append("extends ");
            String s = clazz.getSuperclass().getSimpleName() + " ";
            stringBuilder.append(s);
        }

        //Class Array of implemented interfaces
        Class<?>[] classes = clazz.getInterfaces();

        //If it has implemented interfaces, loop through, and add them to output string
        if (classes.length > 0) {
            boolean first = true;
            stringBuilder.append("implements ");

            for (Class<?> c : classes){
                String s;
                stringBuilder.append(first ? c.getSimpleName() : ", " + c.getSimpleName());
                first = false;
            }
        }

        //returns final string
        return stringBuilder.toString();
    }

    protected String getFieldInfo(Field field) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(field.getName());

        return stringBuilder.toString();
    }

    protected String getConstructorInfo(Constructor<?> constructor) {
        StringBuilder stringBuilder = new StringBuilder();
        int mods = constructor.getModifiers();

        if (Modifier.isPublic(mods)) stringBuilder.append("public ");
        if (Modifier.isPrivate(mods)) stringBuilder.append("private ");
        if (Modifier.isProtected(mods)) stringBuilder.append("protected ");

        stringBuilder.append(constructor.getDeclaringClass().getSimpleName());


        stringBuilder.append("(");
        boolean first = true;
        for (Parameter parameter : constructor.getParameters()) {
            stringBuilder.append(first ? "" : ", ").append(parameter.getType()).append(" ").append(parameter.getName());
            first = false;
        }
        stringBuilder.append("){}");

        /* return final string */
        return stringBuilder.toString();
    }

    protected String getMethodInfo(Method method) {
        StringBuilder stringBuilder = new StringBuilder();

        Parameter[] param = method.getParameters();
        stringBuilder.append(method.getName());
        return stringBuilder.toString();
    }


    public static void main(String[] args){
        Decompiler decomp = new Decompiler();

        try {
            System.out.println(decomp.decompile(TestClass.class));
        } catch (Exception e) {
            System.exit(0);
        }

    }
}
