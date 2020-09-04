public class Variables {

    /**
     * Variables are containers for storing data values
     * 
     * Types of Variables
     * 
     * 1. String    -- e.g -- "Hello" -- surrounded by double quotes
     * 2. int       -- e.g -- 1243546 -- whole numbers
     * 3. float     -- e.g -- floating point numbers (real numbers) -- 14.8, 12.67 ....
     * 4. char      -- only stores a single character -- 'A' -- surrounded by single quotes
     * 5. boolean   -- stores values which are either [true or false]
     * 
     * =====================================
     * 
     * Syntax for Declaring a Variable
     *      --> datatype variablename = value;
     *      --> String name = "Johnson";
     */

    public static void main(String[] args) {
        String name = "Johnson";
        int myNumber = 29;
        String myNumber2 = "" + 56;

        String variable;
        variable = "Udemy Course";

        // final variables -- creates a constant variable
        final int myNum = 23;
        // myNum = 56;

        int mynUm = 56;

        System.out.println(myNum);
    }

}