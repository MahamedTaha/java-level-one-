package problemSolving;


import java.util.Scanner;

public class calculatingStudentGrades {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        System.out.print("Enter the numbers of students : ");
        int line = inpute.nextInt();
        System.out.print("Enter the numbers of degrees : ");
        int columns = inpute.nextInt();

        int[][] degrees = new int[line][columns];
        int[] Total = new int[line];

        for (int i = 0; i < line; i++) {

            System.out.println("Enter degree of student " + (i + 1));

            for (int y = 0; y < columns; y++) {

                System.out.print("mark of subject " + (y + 1) + " : ");
                degrees[i][y] = inpute.nextInt();

            }

        }

        for (int i = 0; i < line; i++) {

            int sum = 0;
            for (int y = 0; y < columns; y++) {

                sum += degrees[i][y];
            }

            Total[i] = sum;
        }

        for (int i = 0; i < line; i++) {

            System.out.println("the Total of student " + (i + 1) + " : " + Total[i]);
        }

    }

}
