package homeworkdec4;

import java.util.*;

//1)WAP to convert ArrayList to array in 2 different ways and array to ArrayList in 2  [2M]
//different ways (so total 4 ways)

public class Q1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //Array to Arraylist
    String s[] = { "rahul", "shubham", "chubbham" };
    List al = Arrays.asList(s);
    System.out.println(al);
    //		int [] in = {1,2,9};

    //		List al2 =Arrays.asList(in);
    //		System.out.println(al2);
    List<String> al3 = new ArrayList<String>();
    Collections.addAll(al3, s);
    System.out.println(al3);
    //		List <Integer > al4 = new ArrayList <Integer>();
    //		Collections.addAll(al4, in);

    // List to array
    Object[] stringarr = al3.toArray();
    System.out.println(Arrays.toString(stringarr));

    String stringarr2[] = new String[al3.size()];
    al3.toArray(stringarr2);
    System.out.println(Arrays.toString(stringarr2));
  }
}
