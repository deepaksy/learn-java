package exceptions;

public class NullPontExceptions {
    public static void main(String[] args) {
        String name=null;
        try{
            System.out.println(name.length());
        }
        catch(NullPointerException npe){
            System.out.println("Error occured!");
        }
        System.out.println("hey!");
    }
}
