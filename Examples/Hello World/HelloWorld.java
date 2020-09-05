public class HelloWorld {

    // This is a main method that runs our code.
    public static void main(String[] rich) {
        System.out.println(rich);
        System.out.println("Welcome to Java Learning Class"); // This Outputs Welcome to Java Learning Class
        String name = "";
        System.out.println("Hello World Java !!!");
        Comment();
    }

    // Single Comment

    /**
     * Multiple Line Comment
     * 
     */

    static void Comment(){
        System.out.println("I am Commenting");

        Comment("Please Comment", 5);
    }
    static void Comment(String word, int letter, int numOfTimes){}
     
    static void Comment(int letter, String word){}

    static void Comment(String word, int numOfTimes){
        System.out.println(word + " " + numOfTimes + " times");
    }

}