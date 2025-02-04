import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args){

        /*
        Type casting refers to converting one type of data to another.
        There are two types of type casting in java:
            - Implicit Type casting
            - Explicit Type casting
         */

        /*
        Implicit Type Casting -
            - Happens automatically when converting smaller to larger data types.
            - No data loss occurs.
            - Done automatically by Java.
            - Hierarchy - byte → short → int → long → float → double
         */

        int implicit_number_in_integer = 10;  // Integer (4 bytes)
        double implicit_number_in_double;
        implicit_number_in_double = implicit_number_in_integer;  // Implicit conversion to double (8 bytes)

        System.out.println("Implicit Type Casting");
        System.out.println("Integer value: " + implicit_number_in_integer);
        System.out.println("Converted to double: " + implicit_number_in_double);
        System.out.println();



        /*
        Explicit Type Casting  -
            - Happens manually when converting larger to smaller data types or vice versa.
            - May result in data loss or precision loss in case of conversion of larger to smaller number.
            - Requires explicit casting using (type).
         */

        double explicit_number_in_double01 = 10.99;    // Double (8 bytes)
        int explicit_number_in_integer01 = (int) explicit_number_in_double01;   // Explicitly converting to int (4 bytes)

        System.out.println("Explicit Type Casting - larger to smaller");
        System.out.println("Double value: " + explicit_number_in_double01);
        System.out.println("Converted to int: " + explicit_number_in_integer01);
        System.out.println();

        /*
        Note: Here as seen in the output, data loss occurred as the value 10.99 was converted to 10.
              Therefor it is not recommended in most of the use cases.
         */

        double explicit_number_in_integer02 = 10;    // Integer (4 bytes)
        int explicit_number_in_double02 = (int) explicit_number_in_integer02;   // Explicitly converting to double (8 bytes)

        System.out.println("Explicit Type Casting - smaller to larger");
        System.out.println("Integer value: " + explicit_number_in_integer02);
        System.out.println("Converted to double: " + explicit_number_in_double02);
        System.out.println();

        /*
        Note: Here as seen in the output, data loss has not occurred as the value 10 was converted to 10.0.
              Therefor it is recommended in most of the use cases.
         */



        /*
        One of the most use case of type casting is conversion of char to int and vice versa.
            - In Java, characters (char) and integers (int) are closely related because a char is internally stored
              as an ASCII (Unicode) value, which is an integer representation.
            - A character can be implicitly converted to an integer (ASCII value), as char (2 bytes) is smaller tha int (4 bytes).
            - An integer can be explicitly converted to a character using type casting (if required).
         */

        Scanner sc = new Scanner(System.in);

        char character;
        int integer_value;

        System.out.println("Enter a character");
        character = sc.next().charAt(0);
        /*
        - Java does not provide a built-in nextChar() method in the Scanner class.
        - Therefore, the most common way to take character input is using sc.next().charAt(0).
        - sc.next() reads a String, so charAt(0) extracts the first character.
         */

        integer_value = character; // implicit type conversion
        System.out.println("Character value: " + character);
        System.out.println("Converted to int: " + integer_value);
        System.out.println();


        /*
        -Conversion of an integer value to character value
         */

        int integer;
        char character_value;
        System.out.println("Enter an integer");

        integer = sc.nextInt();
        character_value = (char) integer;// explicit type conversion

        System.out.println("Integer value: " + integer);
        System.out.println("Converted to char: " + character_value);
        System.out.println();

    }

}
