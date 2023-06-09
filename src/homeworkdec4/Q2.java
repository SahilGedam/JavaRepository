package homeworkdec4;

import java.util.*;

public class Q2 {

  //	3) write a program to sort ArrayList by decending without using sort method and without converting into array.
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("akshay");
    al.add("salman");
    al.add("hritik");
    for (int i = 0; i < al.size() - 1; i++) {
      if (al.get(i).compareTo(al.get(i + 1)) > 0) {
        al.add(i, al.get(i + 1));

        al.remove(i + 2);
      }
    }
    Collections.reverse(al);
    System.out.println(al);
  }
}
