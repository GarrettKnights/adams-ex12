/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise12;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {

        //Initializes scanner
        Scanner ScanWord = new Scanner(System.in);

        //Declares variables we will be using
        double principal;
        double IntRate;
        int years;

        //Asks user for input
        System.out.print("Enter the principal ");
        //Scans principal input
        principal = ScanWord.nextDouble();
        //Asks user for input
        System.out.print("Enter the rate of interest ");
        //Scans rate input
        IntRate = ScanWord.nextDouble();

        System.out.print("Enter the number of years ");
        //Scans years input
        years = ScanWord.nextInt();

        //Calculates the % interest rate
        double ActualRate = IntRate/100;
        //Calculates part of the equation
        double randomthing = 1 + (ActualRate * years);
        //Finishes interest rate equation
        double final2 = principal * randomthing;

        //Rounds to nearest penny
        double final3 = Math.ceil(final2 * 100.0) / 100.0;

        //Final print statement
        System.out.print("After " + years + " at " + IntRate + "%, the investment will be worth $" + final3);
    }
}
