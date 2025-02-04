public class DataTypes {

    public static void main(String[] args) {

        int a = 10;
        float f = 12.2f; // Must use 'f' for float values
        double d = 69.88;
        boolean b = true;
        char c = 'a';
        String s = "Hello Github Users";

        /*
          Data Types in Java are divided into 2 types-

        - Primitive Data Types
            - Data types which are the basic building blocks and can't be divided/ broken down into more components.
            - e.g. byte, int, float, double.....

        - Non - Primitive Data Types
            - Data types which are derived from primitive data types .
            - e.g. Strings, array, classes....

          Note : - String is a non-primitive data type as it can be broken down into characters.
                 - In Java, the float data type requires an f or F suffix when assigning decimal values.
                   This is because decimal numbers are treated as double by default, and float has less precision than double.

        - for more in depth knowledge - https://www.geeksforgeeks.org/data-types-in-java/
         */
        System.out.println("Commonly Data Types in Java");
        System.out.println("Integer value is: " + a);
        System.out.println("Float value is: " + f);
        System.out.println("Double value is: " + d);
        System.out.println("Boolean value is: " + b);
        System.out.println("Char value is: " + c);
        System.out.println("String value is: " + s); // non-primitive data type

        System.out.println(); // blank line to leave a space between 2 outputs

        /*
        - Java does not allow short int or long int. Instead, we just use short and long.
        - Unlike C, where sizes depend on the system architecture, Java data types have fixed sizes across all platforms.
        - In C, you can have unsigned int or unsigned long, but Java only supports signed types.

        Sort Data Type -
            - The short data type is a smaller integer type that consumes 2 bytes (16 bits) of memory.
            - Size: 2 bytes (16 bits)
            - Range: -32,768 to 32,767 (-2^15 to 2^15 - 1)

        Long Data Type -
            - The long data type is a larger integer type that consumes 8 bytes (64 bits) of memory.
            - Size: 8 bytes (64 bits)
            - Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63 - 1)

         */

        short s1 = 1000;
        short s2 = -25000;
        long population = 7830000000L;  // Must use 'L' for long values
        long distance = 384400000L; // Distance from Earth to Moon in meters

        System.out.println("Sort and Long Data Types");
        System.out.println("Short value 1: " + s1);
        System.out.println("Short value 2: " + s2);
        System.out.println("World Population: " + population);
        System.out.println("Distance to Moon: " + distance + " meters");
    }
}
