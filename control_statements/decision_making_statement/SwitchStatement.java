package control_statements.decision_making_statement;

public class SwitchStatement {
    public static void main(String[] args) {
        char c='B';

        switch (c) {
            case 'A':
                System.out.println("You chose A.");
                break;
            default:
                System.out.println("No case matched!");
                break;
        }
    }
}
