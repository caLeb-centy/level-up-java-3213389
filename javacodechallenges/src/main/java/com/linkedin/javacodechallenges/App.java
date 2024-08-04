package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {
    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method
        /*
        minimum $18.84 for 1496 gallons (two ccf)
        one ccf is 748
        usee more than 2 ccfs, charges $3.90 per additional ccr
        use 1800 gallons of warer, charges $18.84 pluus $3.90
        for the extra volume
        */
        double ccfUsage  = gallonsToCCF(gallonsUsage);
        double moolah = 18.84;
        if(ccfUsage > 2){
            moolah = moolah + (Math.ceil(ccfUsage-2) * 3.90);
            moolah = Math.round(moolah * 100.0) / 100.0;//round to two decimal places
        }
        return moolah;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }

    private static double gallonsToCCF(double gallons) {
        double ccf = 748;
        double gallonsConverted = gallons / ccf;
        return gallonsConverted;
    }

}


 