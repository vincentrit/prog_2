package Appendix_C;

public class FactorialWithException {
    public static long factorial(long n) {
        // TODO: check and throw exception here

        if (n < 0) throw new ArgumentNegativeException();
        return 0 == n ? 1 : n * factorial(n - 1);

    }

    public static void main(String[] args){
        try {
            factorial(-1); // should throw!
        }catch (ArgumentNegativeException e){
            e.printStackTrace();
        }
    }
}
