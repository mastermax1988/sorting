package sorter;

public class Bubblesort implements Sorter {

  @Override
  public void sort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      boolean sorted = true;
      for (int j = 0; j < a.length - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          Util.swap(a, j, j + 1);
          sorted = false;
        }
      }
      if(sorted){
        return;
      }
    }
  }
}
