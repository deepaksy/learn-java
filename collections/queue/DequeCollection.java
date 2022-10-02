package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeCollection {
    public static void main(String[] args) {
        Deque<Integer> d =new ArrayDeque<Integer>();
        d.push(1);
        d.push(2);
        d.push(3);
        Iterator<Integer> itr=d.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Integer i:d){
            System.out.println(i);
        }
    }
}
