package Exam2020;

import java.time.LocalDateTime;

class CountMyInstances {
    private static int MAX_INSTANCES = 5;
    public static int instances = 0;
    private static CountMyInstances lastInstance;

    static {
        if(LocalDateTime.now().getHour() >= 11) {
            MAX_INSTANCES = 10;
        }
        System.out.println(MAX_INSTANCES);
    }

    private CountMyInstances(){}

    public static CountMyInstances newInstance() {
        if(++instances <= 5) {
            System.out.println("new");
            lastInstance = new CountMyInstances();
        }
        return lastInstance;
    }
}