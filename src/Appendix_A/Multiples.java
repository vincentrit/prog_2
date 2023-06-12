package Appendix_A;

public class Multiples {
    public static void main(String[] args){
        int b = 0;
        int y = 0;

        for(int x = 0; x < 1000; x++){
            if (y == 20) { System.out.print("\n"); y = 0; }
            if (x % 3 == 0) { System.out.print(" " + x); y++; }
            if (x % 5 == 0) { System.out.print(" " + x); y++; }
            b += x;
        }
        System.out.println(b);
    }
}
