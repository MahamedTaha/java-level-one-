package problemSolving;

/*
- Count Change
Write a Java program CountChange to count change. Given the number of quarter, dimes,
nickels and cents the program should output the total as a single value in dollars and cents.
Hint:
● One dollar corresponds to 100 cents
● One quarter corresponds to 25 cents
● One dime corresponds to 10 cents
● One nickel corresponds to 5 cents
For example if we have: 3 quarters, 2 dimes, 1 nickel and 6 cents, the total is 1.06 dollars.
*/

import java.util.Scanner;

public class countChange {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        System.out.print("Enter the number of dollars : ");
        double dollars = inpute.nextDouble();

        System.out.print("Enter the number of quarters : ");
        double quarters = inpute.nextDouble();

        System.out.print("enter the number of dimes : ");
        double dimes = inpute.nextDouble();

        System.out.print("Enter the number of nickels : ");
        double nickels = inpute.nextDouble();

        System.out.print("Enter the number of cents : ");
        double cents = inpute.nextDouble();

        double theNumberOfDollars = dollars * 100;  // OneDollar = 100 * cent
        double theNumberOfQuarters = quarters * 25; // OneQuarter = 25 * cent
        double theNumberOfDimes = dimes * 10;   // OneDime = 10 * cent
        double theNumberOfNickels = nickels * 5; // OneNickel = 5 * cent
        double theNumberOfCents = cents * 1;  // cent = 1

        double result = (theNumberOfDollars + theNumberOfQuarters + theNumberOfDimes + theNumberOfNickels + theNumberOfCents) / 100;

        System.out.println("the number of dollar : " + result + " Dollar");

    }

}
