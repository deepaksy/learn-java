package oops.abstraction;

public class UseHuman implements Human {

    @Override
    public void speak() {
        System.out.println("Speaking");
    }

    @Override
    public void dance() {

        System.out.println("Dancing..");
        
    }
    public static void main(String[] args) {
        UseHuman obj=new UseHuman();
        obj.dance();
        obj.speak();
    }
}
