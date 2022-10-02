package collections.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorListCollection {
    public static void main(String[] args) {
        Vector<String> names=new Vector<String>();
        names.add("Deepak");
        names.add("Pratik");
        names.add("Vinayak");
        Iterator<String> itr=names.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  

    }

