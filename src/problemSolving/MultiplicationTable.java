package problemSolving;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khale
 */
import java.util.Scanner;
public class MultiplicationTable {
    
    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

        int mult = 1;
        
        System.out.print("   ");
    for (int i = 1; i <= 10; i++){
        System.out.print(i);
        System.out.print("  ");
        
    }
        System.out.println("");
        
    for (int x = 1; x <= 10; x++){
        
        System.out.print(x);
        System.out.print(" ");
        if (x < 10) System.out.print(" ");
        
        
          for (int m = 1; m <= 10; m++){
         
                mult = x * m;
                System.out.print(mult);
                System.out.print(" ");
                if(mult < 10 ) System.out.print(" ");
               
          }
          System.out.println("");
    }
          
          
     
        
        
        
    }

}


