/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemSolving;

import java.util.Scanner;

public class dozensOfApples {

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);

        System.out.println("Enter the number Of Apples");
        int numberOfApples = M.nextInt();
        System.out.println("Enter the Number Of Dozen Apples");
        int theNumberOfDozenApples = M.nextInt();

        System.out.println("The number of dozen apples : " + (numberOfApples / theNumberOfDozenApples));
        System.out.println("The rest of the apples : " + (numberOfApples % theNumberOfDozenApples));
    }
}
