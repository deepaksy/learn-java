package oops.inheritance;

class Base{
    Base(){
        System.out.println("Base class Constructor called.");
    }
    public void display(){
        System.out.println("Base class display method.");
    }
}
class Derived1 extends Base{
    @Override
    public void display(){
        System.out.println("Derived1 class display method.");
    }
}
class Derived2 extends Base{
    @Override
    @Deprecated
    public void display(){
        System.out.println("Derived2 class display method.");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Derived1 d1=new Derived1();
        Derived2 d2=new Derived2();
        d1.display();
        d2.display();        
    }
}
