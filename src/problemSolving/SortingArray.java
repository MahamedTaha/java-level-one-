package problemSolving;

import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        int size = inpute.nextInt();
        inpute.nextLine();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {

            x[i] = inpute.nextInt();

        }

        for (int m = 0; m < size; m++) {

            int min = x[m];
            int min_index = m;
            for (int i = m; i < size; i++) {

                if (x[i] < min) {
                    min = x[i];
                    min_index = i;
                }

            }

            int tmp = x[m];
            x[m] = x[min_index];
            x[min_index] = tmp;

        }

        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }

    }

}
