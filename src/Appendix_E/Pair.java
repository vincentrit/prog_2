package Appendix_E;

public class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable{
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getValue(){
        return this.value;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Pair<?,?>)) return 0;
        if (((Pair<?, ?>) o).key != this.key) return 0;
        if (((Pair<?, ?>) o).value != this.value) return 0;
        return 1;
    }



    public static void main(String[] args){
        Pair<String, String> p = new Pair<>("Name", "Vincent");
        Pair<String, String> p1 = new Pair<>("Age", "Vincent");

        System.out.println(p1.compareTo(p));
    }

}
