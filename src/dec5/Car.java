package dec5;

import java.util.ArrayList;
import java.util.Collections;

public class Car implements Comparable<Car> {

  int modelNo;
  int price;

  Car(int modelNo, int price) {
    this.modelNo = modelNo;
    this.price = price;
  }

  public String toString() {
    return modelNo + " " + price;
  }

  @Override
  public int compareTo(Car o) {
    // TODO Auto-generated method stub
    Car s = (Car) o;
    return this.modelNo - s.modelNo;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<Car> al = new ArrayList<Car>();

    al.add(new Car(1, 70000));
    al.add(new Car(8, 170000));
    al.add(new Car(3, 705000));
    Collections.sort(al);
    System.out.println(al);
  }
}
