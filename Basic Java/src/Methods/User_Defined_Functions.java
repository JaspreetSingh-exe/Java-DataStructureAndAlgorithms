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

public class User_Defined_Functions {

    /*
    A user-defined method is a function created by the programmer to perform a specific task. Unlike predefined methods,
    which are built into Java, user-defined methods allow developers to organize code efficiently, improve reusability, and avoid redundancy.

    Structure of a User-Defined Method
    A method in Java consists of four main parts:

    Method Signature – Includes access modifier, return type, method name, and parameters.
    Method Body – Contains the statements that define what the method does.
    Return Statement – Returns a value (optional if return type is void).
    Method Invocation – Calling the method to execute its functionality.

    More info: https://www.javatpoint.com/method-in-java

     */

    public static void main(String[] args) {
        non_return_method();

        String str = return_type_method();
        System.out.println(str);
        System.out.println();

        parameterized_method("Example of parameterized method");

        /*
        - Object creation.
        - We would study more about objects in object-oriented programming later.
         */

        User_Defined_Functions obj = new User_Defined_Functions();
        obj.non_static_method();

        /*
        - Method overloading allows multiple methods to have the same name but different parameters.
        - More info: https://www.w3schools.com/java/java_methods_overloading.asp
         */

        // This will call the method which has only one string parameter.
        overloading_method("Example of method overloading with one parameter");

        // This will call the method which has two string parameters.
        overloading_method("Example of"," method overloading with two parameters");
    }

    /*
    - Below are the examples of non- parameterized return and non-return method.
     */

    // Void method to print a message in the method itself.
    public static void non_return_method() {
        System.out.println("Example of non-return type method");
        System.out.println();

    }

    // Method to return a string.
    public static String return_type_method() {
        return "Example of return type method";
    }

    // Non-Return parameterized method.
    public static  void parameterized_method(String str) {
        System.out.println(str);
        System.out.println();
    }

    /*
    Note: - Above all the methods are static, so they can be directly called.
          - Non - Static methods like given below need an object to call them.
     */

    public void non_static_method() {
        System.out.println("Example of non-static type method");
        System.out.println();
    }

    // Method Overloading.
    public static void overloading_method(String str) {
        System.out.println(str);
        System.out.println();
    }

    public static void overloading_method(String str1,String str2) {
        System.out.println(str1+str2);
    }

}
