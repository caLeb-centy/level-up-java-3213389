package com.linkedin.javacodechallenges;

import java.util.*;
import java.util.random.*;

public class DoubleOrNothing {
  private int points;

  public void playGame() {
    Scanner scanner = new Scanner(System.in); 
    RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
    this.points = 10;
    int status = checkInput(scanner);
  
    while(status != 0){
        if(g.nextInt(0, 2) == 1){
          System.out.println("success you doubled your points");
          this.points = this.points * 2;
          status = checkInput(scanner);     
        }
        else{
          System.out.println("you lost all your points");
          this.points = 0;
          status = 0;
        } 
    }

    System.out.println("thanks for playing");
    scanner.close();    
  }

  protected int checkInput(Scanner scanner){
    int status = 2; // assume input is invalid    
    String input;

    do{  // user MUST enter either yes or no
      menu();
      input = scanner.nextLine();
      if(input.compareTo("no") == 0){  // user does not want to play game
        status = 0; 
      }
      else if(input.compareTo("yes") == 0){  // user wants to play game  
        status = 1;
      }
      else{ // input is  invalid, so status is still 2
        System.out.println("invalid input");  
      }    
    }while(status == 2);

    return status;
  }

  protected void menu(){
    System.out.println("you have " + this.points + " points");
    System.out.println("would you like to double your points, yes or no? ");
  }

}