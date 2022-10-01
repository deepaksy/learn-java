package generics;
class Box<T>{
    // T stands for Type.
    private T t;
    public void setT(T t){
        this.t=t;
    }
    public T getT(){
        return this.t;
    }
}
public class GenericsEx1{
    
    public static void main(String[] args) {
        Box<Integer> b=new Box<Integer>();
        Box<Boolean> bool=new Box<Boolean>();
        bool.setT(true);
        System.out.println("Boolean value: "+bool.getT());
        b.setT(21);
        System.out.println("Value of Integer: "+b.getT());
    }
}