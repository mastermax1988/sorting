package sorter;

public class Insertionsort implements Sorter {

  @Override
  public void sort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int val = a[i];
      int j = i;
      while (j > 0 && a[j - 1] > val) {
        a[j] = a[j - 1];
        j--;
      }
      a[j] = val;
    }
  }
}
