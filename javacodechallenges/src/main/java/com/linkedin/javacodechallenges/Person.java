package com.linkedin.javacodechallenges;

public class Person {
  private int age;
  private String firstName = new String();
  private String lastName = new String();

  protected String getfirstName(){
    return firstName;
  }

  protected String getlastName() {
    return lastName;
  }

  protected int getAge(){
    return age;
  }

  protected void setlastName(String newLastName) {
    this.lastName = newLastName;
  }

  protected void setfirstName(String newfirstName) {
    this.firstName = newfirstName;
  }

  protected void setAge(int newAge) {
    this.age= newAge;
  }

  protected void introduction(){
    System.out.println("hello, my name is "+firstName + "" + lastName + ".");
    System.out.println("I am "+ age +" years old");
  }
}