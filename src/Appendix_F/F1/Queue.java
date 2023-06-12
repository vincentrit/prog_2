package Appendix_F.F1;


import java.util.concurrent.LinkedBlockingQueue;

public class Queue <E>{
    private final int capacity;
    private final LinkedBlockingQueue<E> data = new LinkedBlockingQueue<>();

    public Queue(int capacity) {
        this.capacity = capacity;
    }

    public Queue<E> add(E data){
        if (this.data.size() < this.capacity) this.data.add(data);
        else throw new QueueException("Queue is full");
        return this;
    }

    public E remove(){
        if (this.size() > 0) return this.data.remove();
        throw new QueueException("Queue is empty");
    }

    public E element(){
        return this.data.element();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int size(){
        return this.data.size();
    }

    boolean isEmpty(){
        return this.data.isEmpty();
    }

    public E[] toArray(){
        return (E[]) this.data.toArray();
    }

}
