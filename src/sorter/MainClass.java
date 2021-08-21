package sorter;

import java.util.Random;

public class MainClass {

  public static void main(String[] args) {
    int a[] = new int[20];
    Random rnd = new Random();
    for (int i = 0; i < a.length; i++) {
      a[i] = rnd.nextInt(10000);
    }

    //Sorter sorter = new Bubblesort();
    //Sorter sorter = new Insertionsort();
    Sorter sorter = new Mergesort();
    sorter.sort(a);

    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        System.out.println("nicht sortiert!");
        return;
      }
    }
    System.out.println("sortiert!");
  }


}
