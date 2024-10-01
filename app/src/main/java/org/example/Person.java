package org.example;

/** Person */
public class Person {
  private String name;
  private String lastName;
  private int birthDate;
  private int points;
  private String grade;

  public Person(String name, String lastName, int birthDate, int points, String grade) {

    this.name = name;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.points = points;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public String getGrade() {
    return grade;
  }

  public int getPoints() {
    return points;
  }

  public String getLastName() {
    return lastName;
  }

  public int getBirthDate() {
    return birthDate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public void setPoints(short points) {
    this.points = points;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setBirthDate(int birthDate) {
    this.birthDate = birthDate;
  }
}
