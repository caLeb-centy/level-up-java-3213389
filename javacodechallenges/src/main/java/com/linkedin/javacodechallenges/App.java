package com.linkedin.javacodechallenges;
import java.time.LocalDate;
import java.time.ZoneId;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now

    protected static String hundredDays(){
        //create a default time zone 
        LocalDate currentDate = LocalDate.now(ZoneId.of("America/Chicago"));
        return currentDate.plusDays(100).toString();
    }

    public static void main( String[] args )
    {
        System.out.println("100 days from now is... "   
            + hundredDays());
    }
}
