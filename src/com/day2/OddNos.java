package com.day2;

public class OddNos {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // odd numbers between 25 to 15
    int a;
    for (a = 25; a >= 15; a--) {
      if (a % 2 != 0) {
        System.out.println(a);
      }
    }
  }
}
