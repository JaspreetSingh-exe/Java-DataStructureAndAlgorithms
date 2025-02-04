public class ConditionalStatements {

    public static void main(String[] args) {

        /*
        Conditional statements in Java allow the execution of specific blocks of code based on certain conditions.
        They help control the flow of execution in your programs.

            - if statement: The if statement is used to execute a block of code only if a specific condition is true.

                if (condition) {
                    // code block to be executed if condition is true
                   }
        */

        int num = 10;
        System.out.println("Output of example of if statement");
        if (num > 5) {
            System.out.println("The number is greater than 5");
        }
        System.out.println();

        /*

            - if-else statement: The if-else statement allows you to execute one block of code if the condition is true, and another block if it is false.

                if (condition) {
                    // code block if condition is true
                   }
                   else {
                    // code block if condition is false
                   }

                   */

        System.out.println("output of example of if-else statement");
        if (num > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is not greater than 5");
        }
        System.out.println();


        /*
            - if - else-if statement: The else-if ladder/statement allows multiple conditions to be checked sequentially. If the first condition is false, it checks the next one, and so on.

                if (condition1) {
                    // code block if condition1 is true
                   }
                else if (condition2) {
                   // code block if condition2 is true
                    }
                else {
                    // code block if none of the conditions are true
                    }
        */

        System.out.println("output of example of if-else-if statement");
        if (num > 15) {
            System.out.println("The number is greater than 15");
        } else if (num > 5) {
            System.out.println("The number is greater than 5 but less than or equal to 15");
        } else {
            System.out.println("The number is 5 or less");
        }
        System.out.println();

        /*
            - swtich statement: The switch statement is used to execute one of many blocks of code based on the value of a variable. It is generally used when there are many conditions based on a single variable.

                switch (variable) {
                            case value1:
                                    // block of code
                                    break;
                            case value2:
                                     // block of code
                                     break;
                            default:
                                     // block of code if no case matches
                                }
        */

        System.out.println("Output of example of switch statement");
        int day = 3;

         /*
             Note : - The data type of choice ( here choice is day variable) and case (case1, case2..) should be same
                    - Here the choice/ case parameter which is passed is of integer type the cases are of int type like case1, case2 .....
                    - The choice can be of any type like char, double and other data types
             */

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
                // here break statement break the switch and go outside the switch.
                // if there was no break the each case below that also satisfies would also print the output.

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}