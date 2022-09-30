package oops.ploymorphism.overriding;
class Animal{
    public void speak(){
        System.out.println("Speaking....");
    }
}
class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("Barking....");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.speak();
    }
}
