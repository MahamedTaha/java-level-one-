package problemSolving;

import java.util.Scanner;

public class Matrix_Multiplication_Array {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = inpute.nextInt();

        int x[][] = new int[size][size];
        int y[][] = new int[size][size];
        int z[][] = new int[size][size];

        // read x
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                System.out.print("Enter element of array 1 at " + row + " of " + col + " : ");
                x[row][col] = inpute.nextInt();

            }
        }

        System.out.println("-------------");
        // read y
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                System.out.print("Enter element of array 2 at " + row + " of " + col + " : ");
                y[row][col] = inpute.nextInt();

            }
        }
        System.out.println("--------------");
        // multiplcation
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int sum = 0;

                for (int i = 0; i < size; i++) {

                    sum += x[row][i] * y[i][col];

                }

                z[row][col] = sum;
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                System.out.print(z[row][col] + "    ");

            }
            System.out.println("");
        }

    }

}
