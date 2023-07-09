package Exam2020;

public class Exercise1 {


    public static void main(String[] args){
        Exercise1 exercise1 = new Exercise1();

        CountMyInstances x1 = CountMyInstances.newInstance();
        CountMyInstances.newInstance();
        CountMyInstances.newInstance();
        CountMyInstances.newInstance();
        CountMyInstances.newInstance();
        CountMyInstances.newInstance();

        System.out.println(CountMyInstances.instances);
    }

}
