
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorapp;

/**
 *
 * @author Anyona Zaddock
 */
import java.util.Scanner;
public class CalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double result = 0;//initialise result to 0
       boolean firstNumber = true;//set flag to true to indicate we're processing the 1st number
       
       while (true) {//run an infinite loop
           System.out.println("Enter number: ");
           double num = input.nextDouble();
           
           if (firstNumber) {//if this is the first number set result to num
               result = num;
               firstNumber = false;//set the flag to false to indicate we're done with the 1st number
           } else {//if this is not the 1st number prompt the user to enter an operator
               System.out.println("Enter operator(+,-,*,/,= to calculate): ");
               char operator = input.next().charAt(0);//read in hte operator
               
               switch (operator) {
                   case '+' -> result += num;//add num to result
                   case '-' -> result -= num;//subtract num from result
                   case '*' -> result *= num;//multiply result by num
                   case '/' -> result /= num;//Divide result by num
                   case '=' -> {
                       System.out.println("Answer: " + result);//print final result
                       return;//exit program
                   }
                   default -> {
                       System.out.println("Invalid operator!");
                       return;//exit program
                   }
               }
           }
       }
    }
    
}
