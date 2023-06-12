package Appendix_E;

public class CheckTypeArrayElements {
    public static void main(String[] args){
        Object[] arr = {null, "Hallo", 12, 12.0f, 3.0, "a", 2};
        System.out.println(countNumbers(arr));
    }

    public static int countNumbers(Object[] array){
        int x = 0;

        for (Object y : array){
            if (y == null) continue;
            if (y instanceof Number) x++;
        }

        return x;
    }
}
