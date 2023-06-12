package Appendix_C;

public class CatchingExceptions {
    private int erroneousMethod(int p) {
        if (p == 0) {
            throw new IllegalArgumentException();
        }

        int x = 0x01;
        return p / (x >> Math.abs(p));
    }

    public void catchExceptions(int passthrough) {
        try {
            erroneousMethod(passthrough);
        }catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args){
        CatchingExceptions catchingExceptions = new CatchingExceptions();
        catchingExceptions.catchExceptions(-5);
        catchingExceptions.catchExceptions(5);
        catchingExceptions.catchExceptions(0);
    }
}
