package collections.list;
import java.util.Iterator;
import java.util.Stack;
public class StackListCollection {
    public static void main(String[] args) {
        Stack<Integer> marks = new Stack<Integer>();
        marks.push(12);
        marks.push((int)Math.floor(Math.random()*10));
        marks.push((int)Math.floor(Math.random()*10));
        marks.push((int)Math.floor(Math.random()*10));
        Iterator<Integer> itr= marks.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
