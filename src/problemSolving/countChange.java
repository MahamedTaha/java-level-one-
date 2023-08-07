/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemSolving;

import java.util.Scanner;

public class countChange {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);
        
        double cent = 1;
        double OneDollar = 100 * cent ;
        double OneQuarter = 25 * cent;
        double OneDime = 10 * cent;
        double OneNickel = 5 * cent ;
        
        System.out.print("Enter the number of dollars : ");
        double a = inpute.nextDouble();
        System.out.print("Enter the number of quarters : ");
        double b = inpute.nextDouble();
        System.out.print("enter the number of dimes : ");
        double c = inpute.nextDouble();
        System.out.print("Enter the number of nickels : ");
        double d = inpute.nextDouble();
        System.out.print("Enter the number of cents : ");
        double e = inpute.nextDouble();
        
        double theNumberOfDollars = a * OneDollar;
        double theNumberOfQuarters = b * OneQuarter; 
        double theNumberOfDimes = c * OneDime;
        double theNumberOfNickels = d * OneNickel; 
        double theNumberOfCents = e * cent;
        
        double result = (theNumberOfDollars + theNumberOfQuarters + theNumberOfDimes + theNumberOfNickels + theNumberOfCents) / 100;
        
        System.out.println("the number of dollar : " + result + " Dollar");
        
        
    }

}
