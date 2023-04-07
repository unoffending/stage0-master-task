package com.epam.OOP;
// Task 1
public class Animal {
 private String color;
 private int numberOfPaws;
 private boolean hasFur;
 Animal(String color, int numberOfPaws, boolean hasFur) {
   this.color = color;
   this.numberOfPaws = numberOfPaws;
   this.hasFur = hasFur;
 }
  static String getDescription(Animal a) {
              if(a.hasFur == true) { return "this animal is mostly " +
              a.color + "/it has " + a.numberOfPaws + " paws and "
              + "a fur";} else {
              return "this animal is mostly " +
              a.color + "/it has " + a.numberOfPaws + " paws and "
              + "no fur";}
  }
}
