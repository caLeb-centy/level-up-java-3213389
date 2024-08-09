package com.linkedin.javacodechallenges;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class App {
    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {
        /*
        * Algorithm
        * List of incompleteStudents
        * String name;
        * for every student in list
        *  if(searchMap(name) == null) //doesnt exist
        *      incompleteStudents.add(name);
        * 
        * return incompleteStudents
        */
     
        //turn collection of lists into one single list
        List<String> namesOfStudents = attendeesMapping.values().stream()
                .flatMap(List::stream)
                .toList();

        //filter list for names 
        List<String> incompleteStudents = students
                                            .stream()
                                            .filter(name -> Collections.frequency(namesOfStudents, 
                                            name) < 2)
                                            .toList();               
                                            
      return incompleteStudents.isEmpty() ? List.of() : incompleteStudents;
     // return List.of();
    }

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }

}
