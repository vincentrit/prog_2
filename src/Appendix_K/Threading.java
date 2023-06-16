package Appendix_K;

public class Threading {

    public static int x = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) x++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) x--;
        });

        t1.start();
        t2.start();
        t1.join(50000);
        t2.join(50000);

        System.out.println(x);
    }
}
