package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static boolean checkInput (String input) {

        if (input == null) {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        try {
            double d = Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        double bac;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        String gender = se.nextLine();
        checkInput(gender);
        double gen = Double.parseDouble(gender);

        System.out.print("How many ounces of alcohol did you have? ");
        String ounces = se.nextLine();
        checkInput(ounces);
        double oz = Double.parseDouble(ounces);

        System.out.print("What is your weight, in pounds? ");
        String pounds = se.nextLine();
        checkInput(pounds);
        double lbs = Double.parseDouble(pounds);

        System.out.print("How many hours has it been since your last drink? ");
        String hours = se.nextLine();
        checkInput(hours);
        double hrs = Double.parseDouble(hours);

        if(gen == '1'){
            bac = (oz * 5.14 / lbs * .66) - .015 * hrs;
        }
        else{
            bac = (oz * 5.14 / lbs * .73) - .015 * hrs;
        }

        System.out.println("Your BAC is " + bac);

        if(bac <= 0.08){
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}


