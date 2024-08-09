package com.linkedin.javacodechallenges;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;


public class TeamUtils {

  public static void generateTeamsScores(List<Team> teams,
      int numberOfRounds) {
    Random random = new Random();
    teams.forEach(team -> {
      for (int i = 0; i < numberOfRounds; i++) {
        team.getScores().add(random.nextInt(11));
      }
    });
  }

  public static void revealResults(List<Team> teams) {
    /*
     * Game has a series of rounds
     * Each player and partner get points
     * write a program that automatically determines the winner
     * The program should also print the final score
     */

    PriorityQueue<Team> pq = new PriorityQueue<>( (teamOne, teamTwo) 
      -> (Integer.compare(teamTwo.sumTotalScore(), teamOne.sumTotalScore())) );
    pq.addAll(teams);

    printResults(pq);

   // Team winner = pq.poll();
 //   System.out.println("The winning team is " + winner + 
  //    " with a total of " + winner.toString() + " points.");
  }

  static protected void printResults(PriorityQueue<Team> pq){
    Team winner = pq.poll(); //created just to isolate winner 
    System.out.println("Now for the results, the WINNER is...\n");
    System.out.println("With " + winner.sumTotalScore() + " points, it's team "
        + printPlayers(winner) + "!\n");
    System.out.println("\n");

    while(!pq.isEmpty()){
      System.out.println("Then we have... \n");
      System.out.println("With " + pq.peek().sumTotalScore() + " points, it's team "
        + printPlayers(pq.poll()) + "!\n");
      System.out.println("\n");
    }
  }

  static protected String printPlayers(Team team){
    String players = (team.getPlayer1() + " and "+ team.getPlayer2());
    return players;
  }
}