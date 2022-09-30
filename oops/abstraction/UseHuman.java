package oops.abstraction;

public class UseHuman implements Human {

    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println("Speaking");
    }

    @Override
    public void dance() {
        // TODO Auto-generated method stub
        System.out.println("Dancing..");
        
    }
    public static void main(String[] args) {
        UseHuman obj=new UseHuman();
        obj.dance();
        obj.speak();
    }
}
