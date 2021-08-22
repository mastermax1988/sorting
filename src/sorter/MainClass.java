package sorter;

import java.util.Arrays;
import java.util.Random;

public class MainClass {

  public static void main(String[] args) {
    int a[] = new int[10000];
    Random rnd = new Random();
    for (int i = 0; i < a.length; i++) {
      a[i] = rnd.nextInt(1000);
    }
    //a = new int[]{1, 2, 3, 4, 5, 6, 7,8,9,10};
    int b[] = Arrays.stream(a).sorted().toArray();

    //Sorter sorter = new Bubblesort();
    //Sorter sorter = new Insertionsort();
    //Sorter sorter = new Mergesort();
    //Sorter sorter = new Quicksort();
    Sorter sorter = new Heapsort();
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
