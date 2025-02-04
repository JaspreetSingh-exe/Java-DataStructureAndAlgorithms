import java.util.Scanner;
// import scanner class for input operations

public class Main {
    /*
    - Generally the name of the class starts with a capital letter
    - Main is the entry point of the program
    - public is a keyword, known as access modifier, more info - https://www.geeksforgeeks.org/access-modifiers-java/
     */

    public static void main(String[] args) {
        /*
        - public, is an access modifier as mentioned above.
        - static, is keyword allows the JVM to call the main method without creating an object of the class.
        - void, is the return type, returns nothing.
        - main, is a special method name that the JVM recognizes as the starting point of the program.
        - String[] args, is an array of strings used to pass command-line arguments.

         */

        Scanner sc = new Scanner(System.in);
        /*
        - Scanner sc = new Scanner - creating an object
        - sc - name of the object.
        - System.in - Standard input
         */

        System.out.println("Enter name and age");
        String name = sc.nextLine();
        int roll = sc.nextInt();
        /*
        - sc.nextLine() - takes an line as an input.
        - sc.nextInt() - takes an integer as an input.
        - more info - https://www.w3schools.com/java/java_user_input.asp
         */

        System.out.println(name + " " + roll);
        System.out.println("Hello, World!");
        /*
        - System.out.print/println - used for displaying output.
        - print - prints the data in single line.
        - println - prints the data in a single line and move the cursor to the next line.
         */
    }
}