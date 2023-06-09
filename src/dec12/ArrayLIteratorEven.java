package dec12;

import java.util.*;

public class ArrayLIteratorEven {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // int count=0;
    ArrayList<Integer> al = new ArrayList<>();
    al.add(65);
    al.add(75);
    al.add(651);
    al.add(65465);
    al.add(6455);
    al.add(6545);
    //System.out.println(al);
    Iterator<Integer> itr = al.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
      itr.next();
    }
  }
}
