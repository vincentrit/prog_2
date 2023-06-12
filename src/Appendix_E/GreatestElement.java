package Appendix_E;


public class GreatestElement {
    public static void main(String[] args){
        Integer[] ia = {1, 2, 3, 4, 5};
        Float[] fa = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Double[] da = {1.0, 2.0, 3.0, 4.0, 5.0};

        System.out.println(getElement(ia));
        System.out.println(getElement(fa));
        System.out.println(getElement(da));
    }

    public static <T extends Number & Comparable<T>> T getElement(T[] array){
        T largest = array[0];
        for (T x : array){
            if(x.compareTo(largest) > 0) largest = x;
        }

        return largest;
    }

}
