package collections.list;

import java.util.Iterator;
import java.util.LinkedList;

class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}
public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student("Deepak",22));
        students.add(new Student("Pratik",23));
        students.add(new Student("Ajay",23));
        Iterator<Student> itr= students.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}
