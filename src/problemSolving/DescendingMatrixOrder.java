package problemSolving;


import java.util.Scanner;

public class DescendingMatrixOrder {

    public class LearnJava {

        public static void main(String[] args) {
            Scanner inpute = new Scanner(System.in);

            int size = inpute.nextInt();
            int[] x = new int[size];

            for (int i = 0; i < size; i++) {

                x[i] = inpute.nextInt();

            }

            for (int j = 0; j < size; j++) {

                int max = x[j];
                int max_index = j;
                for (int i = j; i < size; i++) {

                    if (x[i] > max) {
                        max = x[i];
                        max_index = i;
                    }
                }

                int tmp = x[j];
                x[j] = x[max_index];
                x[max_index] = tmp;

            }

            for (int i = 0; i < size; i++) {

                System.out.println(x[i]);

            }

        }

    }

}
