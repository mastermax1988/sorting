package sorter;

public class Mergesort implements Sorter {

  @Override
  public void sort(int[] a) {
    mergesort(a, new int[a.length], 0, a.length - 1);
  }

  private void mergesort(int[] a, int[] h, int l, int r) {
    if (l < r) {
      System.out.println("Sort von  " + l + " bis " + r);
      int m = (r + l) / 2;
      mergesort(a, h, l, m);
      mergesort(a, h, m + 1, r);
      merge(a, h, l, m, r);
    }
  }

  private void merge(int[] a, int[] h, int l, int m, int r) {
    System.out.println("Merge von " + l +  " bis " + r);
    int l2 = l;
    int r2 = m + 1;
    int i = l;
    System.arraycopy(a, l, h, l, m + 1 - l);
    System.arraycopy(a, m + 1, h, m + 1, r + 1 - (m + 1));
    while (l2 <= m && r2 <= r) {
      if (h[l2] < h[r2]) {
        a[i++] = h[l2++];
      } else {
        a[i++] = h[r2++];
      }
    }
    while (l2 <= m) {
      a[i++] = h[l2++];
    }
    while (r2 < r) {
      a[i++] = h[r2++];
    }

  }
}
