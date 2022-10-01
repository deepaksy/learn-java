package generics;

public class GenericsClass<K,V> implements User<Integer,String> {
    public K k;
    public V v;
    @Override
    public Integer display() {
        return Id;
    }

    @Override
    public String display(String v) {
        return v;
    }
    public GenericsClass(K key,V value){
        this.k=key;
        this.v=value;
    }
    public static void main(String[] args) {
        GenericsClass<Integer,String> gc=new GenericsClass<Integer,String>(12, "Hey");
        System.out.println(gc.v);
        System.out.println(gc.k);
        System.out.println(gc.display());
        System.out.println(gc.display("Deepak"));
    }
}
