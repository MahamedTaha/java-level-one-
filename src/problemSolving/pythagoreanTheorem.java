package problemSolving;

import java.util.Scanner;

public class pythagoreanTheorem {

    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);
        System.out.println("Calculation of the Pythagorean theorem");

        System.out.print("Enter number one : ");
        double num1 = inpute.nextDouble();
        System.out.print("Enter number two : ");
        double num2 = inpute.nextDouble();
        if (num1 >= num2) {

            int pow1 = 2;
            double powernum1 = Math.pow(num1, pow1);

            int pow2 = 2;
            double powernum2 = Math.pow(num2, pow2);

            double a = powernum1 - powernum2;
            double b = 2 * num1 * num2;
            double c = Math.sqrt(powernum1 + powernum2);

            System.out.println("The result of subtracting the square of the two numbers : " + a);
            System.out.println("Product of 2 * first number * second number : " + b);
            System.out.println("The square root is : " + c);

        } else {
            System.out.println("The first number is smaller than the second number");
        }

    }

}
