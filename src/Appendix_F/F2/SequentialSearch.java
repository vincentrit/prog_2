package Appendix_F.F2;

public class SequentialSearch {
    public final static int ELEMENT_NOT_FOUND = -1;


    public static <T extends Comparable<T>> int sequentialSearch(T[] f, T key) {
        for(int i = 0; i < f.length; i++){
            if(key.compareTo(f[i]) == 0) return i;
        }
        return ELEMENT_NOT_FOUND;
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sequentialSearch(arr, 5));
    }
}
