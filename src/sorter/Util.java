package sorter;

public class Util {

  static void swap(int a[], int i, int j) {
    if (i == j) {
      return;
    }
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
}
