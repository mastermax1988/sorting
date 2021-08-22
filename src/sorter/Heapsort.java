package sorter;

public class Heapsort implements Sorter {

  @Override
  public void sort(int[] a) {
    for (int i = (a.length - 1) / 2; i >= 0; i--) {
      heapify(a, i, a.length - 1);
    }
    heapsort(a, 0, a.length - 1);
  }

  private void heapsort(int[] a, int l, int r) {
    if (l < r) {
      Util.swap(a, 0, r);
      heapify(a, l, r - 1);
      heapsort(a, l, r - 1);
    }

  }

  private void heapify(int[] a, int l, int r) {
    if (2 * l + 1 > r) {
      return;
    }
    int maxindex = 2 * l + 1;
    if (maxindex + 1 <= r && a[maxindex] < a[maxindex + 1]) {
      maxindex++; // rechter zweig ist größer
    }
    if (a[l] < a[maxindex]) {
      Util.swap(a, l, maxindex);
      heapify(a, maxindex, r);
    }
  }
}
