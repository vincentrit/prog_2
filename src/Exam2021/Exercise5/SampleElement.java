package Exam2021.Exercise5;

public class SampleElement2 <T> implements Comparable<SampleElement2<T>>{
    public T obj;

    SampleElement2(T obj) {
        this.obj = obj;
    }

    @Override
    public int compareTo(SampleElement2<T> comp){
        if (this.obj == comp.obj) {return 0;}
        return -1;
    }

}
