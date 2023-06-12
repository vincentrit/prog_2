package Appendix_F.F1;

import java.util.Arrays;

public class MergeQueues {
    public static void main(String[] args){
        Queue<Integer> q1 = new Queue<>(10);
        Queue<Integer> q2 = new Queue<>(6);

        q1.add(1).add(2).add(3).add(4).add(5).add(6).add(7).add(8).add(9).add(10);
        q2.add(20).add(30).add(40).add(50).add(60).add(70);

        Queue<?> result = merge(q1, q2);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static <T extends Queue<?>, E extends  Queue<?>> Queue<?> merge(T queue1, E queue2) {

        Queue<Object> result = new Queue<>(queue1.getCapacity() + queue2.getCapacity());

        while (queue1.size() > 0 || queue2.size() > 0){
            if (queue1.size() > 0) result.add(queue1.remove());
            if (queue2.size() > 0) result.add(queue2.remove());
        }

        return result;
    }

}
