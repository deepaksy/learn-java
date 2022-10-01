package generics;

class Box<T>{
    private T t;
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return this.t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: "+t.getClass().getName());
        System.out.println("U: "+u.getClass().getName());
    }
}
public class BoundedGenerics {
    public static void main(String[] args) {
        Box<Integer> b= new Box<Integer>();
        b.set(12);
        b.inspect(1);
    }
}
