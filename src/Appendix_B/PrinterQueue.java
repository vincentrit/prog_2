package Appendix_B;

public class PrinterQueue {
    private static final PrinterQueue INSTANCE;

    private PrinterQueue(){

    }

    static {
        INSTANCE = new PrinterQueue();
    }

    public static PrinterQueue getInstance() {
        return INSTANCE;
    }


    public void print(String massage){
        System.out.println(massage);
    }

}
