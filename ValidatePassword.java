/*
 * Author: Mauricio Lopez
 * Date: December 4, 2023
 * Purpose: Create a simple program that will prompt the user
 *          to enter a password and validate the input based 
 *          on the requirements. 
 */

import java.util.Scanner;

public class ValidatePassword 
{
    public static void main(String[] args) 
    {
       // Variables 
       Scanner in = new Scanner(System.in);
       String word1 = " ";
       boolean badInput = false;
       int upperCaseCount = 0;
       int lowerCaseCount = 0;
       int digitCount = 0;
       
       do
       {
            // Input
            System.out.println("Password must contain:");
            System.out.println("\tMinimum of 2 uppercase letters");
            System.out.println("\tMinimum of 2 lowercasecase letters");
            System.out.println("\tMinimum of 1 digit");
            System.out.println("*******************************************");
            System.out.print("Create a password >> ");
            word1 = in.nextLine();

            // Iterate the length of the inputted word
            for(int i = 0; i < word1.length(); i++)
            {
                char letter = word1.charAt(i);

                // Counting upper-case letters 
                if(Character.isUpperCase(letter))
                {
                    upperCaseCount++;

                }

                // Counting lower-case letters
                if(Character.isLowerCase(letter))
                {
                    lowerCaseCount++;
                } 

                // Counting digits
                if(Character.isDigit(letter))
                {
                    digitCount++;
                }
            } // end for

            // Validation
            if(upperCaseCount >= 2)
            {
                badInput = true;
            }
            else
            {
                System.out.println("The password did not have enough:");
                System.out.print("uppercase letters\n");
                badInput = false;
            }

            if(lowerCaseCount >= 3)
            {
                badInput = true;

            }
            else
            {
                System.out.println("The password did not have enough:");
                System.out.print("lowercase letters\n");
                badInput = false;
            }
            
            if(digitCount >= 1)
            {
                badInput = true;
            }
            else
            {
                System.out.println("The password did not have enough:");
                System.out.print("digits\n");
                badInput = false;
            }
            
        
       } while(!badInput && digitCount < 1 || lowerCaseCount < 3 || upperCaseCount < 2);
        
        // Output
        System.out.println("Valid password");
    }
}
