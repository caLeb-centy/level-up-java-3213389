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
      -> (Integer.compare(teamOne.sumTotalScore(), teamTwo.sumTotalScore())) );
    Team winner = pq.poll();
    System.out.println("The winning team is " + winner + 
      " with a total of " + winner.toString() + " points.");
  }
}