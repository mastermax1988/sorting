package sorter;

public class Quicksort implements Sorter {

  @Override
  public void sort(int[] a) {
    quicksort(a, 0, a.length - 1);
  }

  private void quicksort(int[] a, int l, int r) {
    if (l < r) {
      int divider = divide(a, l, r);
      quicksort(a, l, divider-1);
      quicksort(a, divider + 1, r);
    }

  }

  private int divide(int[] a, int l, int r) {
    /*int m = (l+r)/2;
    int pivot = a[m];
    Util.swap(a,m,r);*/
    int pivot = a[r];
    int index = l;
    for(int i=l;i<r;i++){
      if(a[i]<pivot){
        Util.swap(a,i,index++);
      }
    }
    Util.swap(a,r,index);
    return index;
  }
}
