package Arrays;

import java.util.Scanner;

/*
    - In Java, an array is a collection of variables of the same type stored in contiguous memory locations.
      Arrays allow storing multiple values under a single name, making it easier to manage large datasets.

    - Characteristics of Arrays in Java
       - Fixed Size: Once declared, the size of an array cannot be changed.
       - Same Data Type: All elements in an array must be of the same data type.
       - Zero-based Indexing: The index of an array starts from 0.
       - Stored in Contiguous Memory: Arrays are stored in contiguous memory locations for fast access.
       - Can be Single or Multi-Dimensional: Java supports one-dimensional, two-dimensional, and multidimensional arrays.

 */
public class BasicArray {

    public static void main(String[] args) {

        // Array Declaration
        int [] Arr;
        double [] marks;
        String [] names;

        //or
        int [] array = new int[5]; // defined the size of the array

        //or
        int [] arr = {1,2,3,4,5}; // directly defining the elements of the array

        /*
        Operations that can be done on arrays
        Note: Array index starts from 0.
         */

        // Accessing the elements in an array
        System.out.println("Element at 0th position: " + arr[0]);  // Output: 1
        System.out.println("Element at 3rd position: " + arr[3]);  // Output: 4
        System.out.println();

        // Modifying an element
        arr[2] = 10; // Changing the value at index 2
        System.out.println("Updated value of arr[2] is: " + arr[2]);  // Output: 10
        System.out.println();

        /*
       Making array by taking input from the user
       We do this by iterating over the length of the array,
         */

        Scanner sc = new Scanner(System.in);

        int [] x = new int[5];

        for(int i=0; i< 5; i++)
        {
            System.out.print("Enter the "+i+"th element in the array: ");
            x[i] = sc.nextInt();
        }
        System.out.println();

        // printing all the elements of the array
        System.out.println("All elements in the array are - ");
        for(int j = 0; j< 5; j++)
        {
            System.out.print(x[j]+ " ");
        }
        System.out.println();
        System.out.println();

        //  Note: Array length can be calculated as array_name.length;


        /*
        - Two dimensional arrays
        - They are represented like matrix like structure consisting of rows and coloumns
        - Practically they are stored linearly in row major or column major order.

         */

        // Declaration of 2D array

        int[][] Matrix;

        //or
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Operations on 2D Array
        System.out.println("Element at 1st row, 2nd column: " + matrix[1][2]); // Output: 6
        System.out.println("Element at 2nd row, 1st column: " + matrix[2][1]); // Output: 8
        System.out.println();

        matrix[1][2] = 69;
        System.out.println("Updated element at 1st row, 2nd column: " + matrix[1][2]); // Output: 69
        System.out.println();


        /*
        - Taking user input for 2D arrays
         */

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print("Enter the "+i+" row and "+j+" column element in the array: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        // printing of the 2D matrix
        System.out.println("The 2D matrix is: ");
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
