package generics;

interface User<K,V>{
    public static int Id=01;
    abstract K display();
    abstract V display(V v);
}

public class GenericsInterface implements User<Integer,String>{
    public static void main(String[] args) {
        GenericsInterface gi=new GenericsInterface();
        System.out.println("ID: "+gi.display());
        System.out.println("Name: "+gi.display("Deepak"));
    }

    @Override
    public Integer display() {
        return Id;
    }

    @Override
    public String display(String v) {
        return v;
    }
}
