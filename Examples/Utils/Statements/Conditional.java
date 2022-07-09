import java.util.*;

public class Conditional {

    void ifStatements() {

        // statements run when Java Code returns true...
        int num1 = 115;
        int num2 = 31;

        System.out.println("ON THE IF STATEMENT");

        if (num1 > num2){
            System.out.println("The Number is Greater");
        }
        else if (num1 == num2){
            System.out.println("The Number is Equal to Each Other");
        }
        else{
            System.out.println("The Number is Not Greater");
        }

    }

    void switchStatements(int userRole) {
        // int userRole = 5;
        String userType = "";
        switch (userRole) {
            case 1:
                userType = "Administrator";
                break;
            case 2:
                userType = "Instructor/Teacher";
                break;
            case 3:
                userType = "Student";
                break;
            default:
                userType = "Invalid User";
                break;
        }
        System.out.println("Current User Role/Type is " + userType);
    }

    public static void main(String[] args) {
        
        // IF
        // SWITCH
        
        System.out.println("Please Provide a valid Number");

        Scanner input = new Scanner(System.in);

        try {
            
            int value = input.nextInt();

            Conditional conditions = new Conditional();
            conditions.switchStatements(value);

        } catch (Exception e) {
            System.err.println("You didn't Provide a Valid Number");
        }

    }

}