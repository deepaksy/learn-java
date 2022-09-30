package control_statements.decision_making_statement;

public class NestedIfElse {
    public static void main(String[] args) {
        int a=45;
        if(a>12){
            if(a%2==0){
                System.out.println(a+" is greater than 12 and an even number");
            }
            else{
                System.out.println(a+" is greater than 12 and an odd number.");
            }
        }
        else{
            if(a%2==0){
                System.out.println(a+" is smaller than 12 and an even number");
            }
            else{
                System.out.println(a+" is smaller than 12 and an odd number.");
            }
        }
    }
}
