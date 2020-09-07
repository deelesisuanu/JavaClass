class Arithmetic {

    /**
     * Arithmetic Operators are Mathematical Operators
     * E.g Add, Subtract, Multiply, Divide, Remainder
    */

    int addition(int num1, int num2){
        return num1 + num2;
    }

    int subtraction(int num1, int num2){
        return num1 - num2;
    }

    int multiply(int num1, int num2){
        return num1 * num2;
    }

    int division(int num1, int num2){
        return num1 / num2;
    }

    int remainder(int num1, int num2){
        return num1 % num2;
    }

    void process(int num1, int num2){

        int sum = addition(num1, num2);
        int subtract = subtraction(num1, num2);
        int multiply = multiply(num1, num2);
        int divided = division(num1, num2);
        int remaining = remainder(num1, num2);
        
        String fullDivided = num1 + " / " + num2 + " = " + divided + " Remainder " + remaining;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divided);
        System.out.println(num1 + " % " + num2 + " = " + remaining);
        System.out.println("------------------------------------");
        System.out.println(fullDivided);
    }

    public static void main(String[] args) {
        
        Arithmetic arith = new Arithmetic();
        int num1 = 32, num2 = 10;
        arith.process(num1, num2);
        
    }

}