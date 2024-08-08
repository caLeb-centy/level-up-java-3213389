package com.linkedin.javacodechallenges;

import java.util.Iterator;
import java.util.List;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        /*
         * given a purchase you round up to the nearest dollar and invest the change
         * example: coffee was $2.27, invest 73 cents
         * after going through all purchases, return average 
         * //IMPORTANT CASES
         *  when a purchase is flat ie, $3.00
         *  when a purchase is zero
         *  when a purchase is negative
         */

         /*
          * ALGORITHM
          * double avg = 0
          * double sum = 0
          * double num
          * int count = 0
          *
          * for every item in the list
          *     num = a purchase from the list
          *     if num > 0
          *         sum = sum + (numROunded - num)
          *         ++count
          * if(avg > 0)
          *     avg = avg / count
          * return avg
          */
        double sum = 0;
        double avg = 0;
        double num;
        int count = 0;
        Iterator<Double> itt = purchases.iterator();

        while(itt.hasNext()){
            num = purchases.get(count);
            if(num > 0){
                sum = sum + (Math.ceil(num) - num);
                ++count;
            }
            itt.next();
        }

        if(sum > 0){
            avg = sum / count;
        }

        return avg;
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
