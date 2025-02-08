package Methods;

/*

    - A method in Java is a block of code that performs a specific task only when called.
    - It is used to increase reusability, modularity, and readability in a program.
    - Methods allow us to avoid code duplication and structure our logic efficiently.
    - Methods are used to perform certain actions, and they are also known as functions.

    - Syntax of methods:

        access modifier returnType methodName(parameters) {
                // Method body (statements)
                return value; // (if returnType is not void)
            }

       - Access modifier: used to specify the access of the method(public, private, protected).
       - return type: used to specify whether the function/ method returns anything or not.
                      - int: return value is integer
                      - double: return value is double
                      - float: return value is float
                      - many more...

                      - void: return nothing.
       - parameters: - A method may use parameter.
                     - Parameterized method: Function which use parameters, generally passed form main.
                     - Non- Parameterized method: which doesn't use any parameter.

    - In java methods can be divided into two categories: - User Defined Methods
                                                          - Pre Defined Methods


 */

import java.util.Arrays;
import java.util.Scanner;

public class PreDefined_Methods {

    /*
    In this file we are going talk about pre-defined methods

    Predefined Methods in Java:
       - Predefined methods are built-in functions provided by Java libraries that allow us to perform common operations
         without writing custom logic.

    Java provides predefined methods across different classes such as:
        - Math Class (java.lang.Math) – Mathematical operations.
        - String Class (java.lang.String) – String manipulation.
        - Arrays Class (java.util.Arrays) – Array operations.
        - Collections Class (java.util.Collections) – List and collection manipulation.
        - System Class (java.lang.System) – System-related tasks.
        - Scanner Class (java.util.Scanner) – User input handling.
        - File Class (java.io.File) – File operations.
        - Date and Time Classes (java.time) – Handling date/time.
*/

    public static void main(String[] args) {

        /*
        - The Scanner class allows reading input from the user.
        - The methods provided like nextInt, nextLine is pre-defined in the scanner class.
        - more info:  https://www.w3schools.com/java/java_user_input.asp
         */

            System.out.println("Examples of Math class pre- defined methods");
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = sc.nextLine(); // Reads a line of text

            System.out.print("Enter your age: ");
            int age = sc.nextInt(); // Reads an integer

            System.out.println("Hello, " + name + "! You are " + age + " years old.");
            System.out.println();



        /*
        - The Math class provides methods for mathematical calculations.
        - More info: https://www.w3schools.com/java/java_ref_math.asp
        */

        System.out.println("Examples of Math class pre- defined methods");
        System.out.println(Math.max(10, 20)); // Gives the maximum values between two numbers.
        System.out.println(Math.sqrt(25));    // Gives the square root of the number provided.
        System.out.println(Math.abs(-7));     // Gives the absolute value of the number provided.
        System.out.println(Math.pow(2, 3));   // Gives the first number, power of, by second number, here 2^3.
        System.out.println(Math.random());    // Gives a random number (0.0 to 1.0).
        System.out.println();


        /*
        - The String class provides methods for working with text.
        - more info: https://www.w3schools.com/java/java_ref_string.asp

         */

        String str = "Hello Github Users";

        System.out.println("Examples of String class pre- defined methods");
        System.out.println(str.length());            // Gives the length of the String.
        System.out.println(str.toUpperCase());       // Converts all the characters of the string to upper case.
        System.out.println(str.toLowerCase());       // Converts all the characters of the string to lower case.
        System.out.println(str.charAt(0));           // Gives the character present at the provided location.
        System.out.println(str.replace("Hello", "Hi")); // Replaces the target string with given string.
        System.out.println();


        /*
        - The Arrays class provides utility methods for arrays.
        - more info: - https://www.w3schools.com/java/java_ref_arrays.asp
                     - https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
         */

        System.out.println("Examples of Array class pre- defined methods");
        int[] arr = {5, 3, 8, 1, 9};

        int length = arr.length; // Calculates the length of the array
        Arrays.sort(arr);  // Sort the array

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " "); // Prints sorted array
        }

        System.out.println();
        System.out.println(Arrays.toString(arr)); // Prints array in string.

        int index = Arrays.binarySearch(arr, 5); // Gives index/ location of the given element in the array.
        System.out.println("Index of 5: " + index); // Note: Index of arrays start from zero.
    }
}
