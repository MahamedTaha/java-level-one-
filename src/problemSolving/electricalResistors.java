/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemSolving;

import java.util.Scanner;

public class electricalResistors {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        System.out.print("Enter The First Resistance : ");
        double FirstResistance = inpute.nextDouble();
        System.out.print("Enter The Scound Resistance : ");
        double secondResistance = inpute.nextDouble();

        double straightResistance = FirstResistance + secondResistance;
        double parallelResistance = (1 / FirstResistance) + (1 / secondResistance );
        System.out.println("the result straight Resistance : " + straightResistance );
        System.out.println("the result parallel Resistance : " + parallelResistance );

    }

}
