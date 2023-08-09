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

/*A program that calculates the sum of the numbers entered by the user and the sum of the positive numbers
and the sum of the odd numbers
It is of the user's choice*/
public class sumEvenAndOdd {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        System.out.print("Enter the number you want to start with : ");
        int fromNamber = inpute.nextInt();
        System.out.print("Enter the number you want to end with : ");
        int toNum = inpute.nextInt();

        int sum = 0;
        int sum_even = 0;
        int sum_odd = 0;

        for (int count = fromNamber; count <= toNum; count++) {

            sum += count;
            if (count % 2 == 0) {
                sum_even += count;
            } else {
                sum_odd += count;
            }
        }
        System.out.println("the sum of number : " + sum);
        System.out.println("the sum of even number : " + sum_even);
        System.out.println("the sum of even number : " + sum_odd);
    }

}
