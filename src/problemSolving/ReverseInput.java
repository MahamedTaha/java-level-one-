/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemSolving;

/**
 *
 * @author khale
 */
import java.util.Scanner;

public class ReverseInput {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        int size = inpute.nextInt();
        inpute.nextLine();
        char[] x = new char[size];
        char[] y = new char[size];

        for (int i = 0; i < size; i++) {

            String str = inpute.nextLine();
            x[i] = str.charAt(0);

        }

        for (int i = size - 1, m = 0; i >= 0; i--, m++) {
            y[m] = x[i];

        }

        for (int i = 0; i < size; i++) {
            System.out.println(y[i]);
        }

    }
}
