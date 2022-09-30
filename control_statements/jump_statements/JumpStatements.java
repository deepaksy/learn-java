package control_statements.jump_statements;

public class JumpStatements {
    public static void main(String[] args) {
        int i=0;
        for(;;){
            if(i>100){
                break;
            }
            if(i==99){
                continue;
            }
            System.out.println(i);
            i++;

        }
    }
}
