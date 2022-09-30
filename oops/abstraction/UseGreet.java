package oops.abstraction;

public class UseGreet extends Greet {

    @Override
    void greet() {
        System.out.println("Hello User!.");
        
    }
    
    public static void main(String[] args) {
        UseGreet obj=new UseGreet();
        System.out.println(obj.about());
        obj.greet();
    }
}
