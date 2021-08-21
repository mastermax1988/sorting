package sorter;

import java.util.Arrays;
import java.util.Random;

public class MainClass {

  public static void main(String[] args) {
    int a[] = new int[10000];
    Random rnd = new Random();
    for(int i = 0 ; i<a.length;i++){
      a[i] = rnd.nextInt(Integer.MAX_VALUE);
    }

    Sorter sorter = new Bubblesort();
    sorter.sort(a);

    for(int i=0;i<a.length-1;i++){
      if(a[i]>a[i+1]){
        System.out.println("nicht sortiert!");
        return;
      }
    }
    System.out.println("sortiert!");
  }


}
