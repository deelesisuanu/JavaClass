import java.util.*;

public class Loops {

    private static final String ERROR_MSG = "You didn't Provide a Valid Number";

    void whileLoop(int num1, int num2) {
        while(num1 <= num2) {
            System.out.println("Value of Number: " + num1);
            num1++;
        }
    }

    void doWhileLoop() {}

    void forLoop() {}

    void forEachLoop() {}

    int inputScanner(String scannerMsg, String scannerErrMsg){
        System.out.println(scannerMsg);
        Scanner scanner = new Scanner(System.in);
        int outputNumber = 0;
        try {
            outputNumber = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(scannerErrMsg);
        }
        return outputNumber;
    }

    void executeWhileLoop() {
        int input1 = inputScanner("Please Provide a valid First Number", ERROR_MSG);
        if (input1 != 0){
            int input2 = inputScanner("Please Provide a valid Second Number", ERROR_MSG);
            if (input2 == 0){
                return;
            }
            whileLoop(input1, input2);
        }
    }

    public static void main(String[] args) {
        
        // WHILE
        // DO WHILE
        // FOR
        // FOR EACH

        Loops loop = new Loops();
        loop.executeWhileLoop();

    }

}