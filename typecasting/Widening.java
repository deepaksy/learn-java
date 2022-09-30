package typecasting;
public class Widening{
    public static void main(String[] args){
        short s=12;
        int i=8922;
        long l=i;
        double d=s;
        System.out.println(s);
        System.out.println(d);
        System.out.println(l);
    }
}