package oops.inheritance;
class Animal{

    public Animal() {
    }
    private int legs;
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void speak(){
        System.out.println("Speaking...");
    }
}

class Dog extends Animal {
    @Override
    public void speak(){
        System.out.println("Bow Bow!");
    }
}
public class IsARelation {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.speak();
        dog.setLegs(4);
        System.out.println("I have "+dog.getLegs()+" legs.");
    }
}
