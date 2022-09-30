package oops.inheritance;
import oops.classes.Human;
class Man extends Human{
    protected String mustache="Full Beard";
}
public class MultilevelInheritance extends Man {
    public static void main(String[] args) {
        MultilevelInheritance mi=new MultilevelInheritance();
        System.out.println(mi.mustache);
        System.out.println(mi.getName());
    }
}
