package sorter;

public class Mergesort implements Sorter {

  @Override
  public void sort(int[] a) {
    mergesort(a, new int[a.length], 0, a.length - 1);
  }

  private void mergesort(int[] a, int[] h, int l, int r) {
    if (l < r) {
      int m = (r + l) / 2;
      mergesort(a, h, l, m);
      mergesort(a, h, m + 1, r);

      for (int i = l; i <= m; i++) {
        h[i] = a[i];
      }
      for (int i = m + 1; i <= r; i++) {
        h[i] = a[i];
      }
      int l2 = l;
      int r2 = m + 1;
      for (int i = l; i <= r; i++) {
        if (r2 > r || (l2 <= m && h[l2] < h[r2])) {
          a[i] = h[l2++];
        } else {
          a[i] = h[r2++];
        }
      }
    }
  }
}
