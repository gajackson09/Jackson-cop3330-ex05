/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program rompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output
import java.util.Scanner;
public class ex05{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //prompts user for numbers
    System.out.print("What is the first number? ");
        String num1 = input.nextLine();
    System.out.print("What is the second number? ");
        String num2 = input.nextLine();

   int convertedNum1=Integer.parseInt(num1);
   int convertedNum2=Integer.parseInt(num2);

   //calculating sum
   int sum = convertedNum1 + convertedNum2;

   //calculating  difference
   int difference = convertedNum1 - convertedNum2;

   //calculating  multiplication
   int product = convertedNum1 * convertedNum2;

   //calculating  quotient
   int quotient = convertedNum1/convertedNum2;

    //printing answers to math
        System.out.println(convertedNum1+" + "+convertedNum2+" = "+sum);
        System.out.println(convertedNum1+" - "+convertedNum2+" = "+difference);
        System.out.println(convertedNum1+" * "+convertedNum2+" = "+product);
        System.out.println(convertedNum1+" / "+convertedNum2+" = "+quotient);
    }//end of class
}//end of main