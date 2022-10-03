package exceptions;

public class Exception1 {
    public static void main(String[] args) {
        try{
            int data=100/0;
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("Bach gya re bawa");
    }
}
