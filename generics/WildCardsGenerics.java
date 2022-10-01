package generics;

import java.util.Arrays;
import java.util.List;

class Box{
    public void printList(List<?> l){
        for(Object obj:l){
            System.out.println(obj);
        }
        System.out.println();
    }
}
public class WildCardsGenerics {
    public static void main(String[] args) {
        Box b= new Box();
        List<Integer> li= Arrays.asList(1,2,3);
        b.printList(li);
    }
}
