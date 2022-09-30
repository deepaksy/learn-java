package oops.ploymorphism.overloading;

class Addition{
    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(double a,double b){
        System.out.println(a+b);
    }
}
public class Overloading{
    public static void main(String[] args) {
        Addition add= new Addition();
        add.add(1,2);
        add.add(1.1,2.2);
    }
}
