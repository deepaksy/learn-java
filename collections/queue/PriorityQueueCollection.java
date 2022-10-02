package collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class User{
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }
}
public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<User> users = new PriorityQueue<User>();
        users.add(new User("Deepak"));
        users.add(new User("Pratik"));
        users.add(new User("Ajay"));
        Iterator<User> itr =users.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}
