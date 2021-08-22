package sorter;

import java.util.Arrays;
import java.util.Random;

public class MainClass {

  public static void main(String[] args) {
    int a[] = new int[100];
    Random rnd = new Random();
    for (int i = 0; i < a.length; i++) {
      a[i] = rnd.nextInt(1000);
    }
    int b[] = Arrays.stream(a).sorted().toArray();

    //Sorter sorter = new Bubblesort();
    //Sorter sorter = new Insertionsort();
    Sorter sorter = new Mergesort();
    sorter.sort(a);

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        System.out.println("nicht sortiert!");
        return;
      }
    }
    System.out.println("sortiert!");
  }


}
