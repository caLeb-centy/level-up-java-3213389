package com.linkedin.javacodechallenges;

import java.util.Scanner;
//import java.lang.*;
public class App {

    public static boolean isPasswordComplex(String password) {
        //solution based off of kathryn Hodge's solution
        boolean status = false;
        if (password.length() >= 6){
            status = 
                (password.matches(".*\\d.*")&&
                password.matches(".*[a-z].*")&&
                password.matches(".*[A-Z].*"));
        }
        return status;
        /*
        must have 6 characters
        must have one upper case character
        musthave one lowercase character
        must have one number
        boolean testOne, testTwo, testThree;
        boolean status = false;
        int n = password.length();
        testOne = testTwo = testThree = false;
        int i =0;       
        if(n >= 6){
            while(i < n && status != true){
                if(testOne == false && Character.isDigit(password.charAt(i)) == true){
                    testOne = true;
                }
                else if(testTwo == false && Character.isUpperCase(password.charAt(i)) == true){
                    testTwo = true;
                }
                else if (testThree == false && Character.isLowerCase(password.charAt(i)) == true) {
                    testThree = true;
                }
                
                if (testOne == true && testTwo == true && testThree == true) {
                    status = true;
                }
                ++i;
            }            
        }
        return status;
        */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
