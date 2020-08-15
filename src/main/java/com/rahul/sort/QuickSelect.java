package com.rahul.sort;

public class QuickSelect {

  public static void main(String[] args) {
    Integer [] array = { 12, 3,4,1,6,9, 20, 0};
    for (Integer el : array){
      System.out.print(el);
      System.out.print(" ");
    }
    System.out.println();
    select(array,3);
    for (Integer el : array){
      System.out.print(el);
      System.out.print(" ");
    }
  }

  public static Comparable select(Comparable[] a, int k) {
    //StdRandom.shuffle(a);
    int lo = 0, hi = a.length - 1;
    while (hi > lo) {
      int j = partition(a, lo, hi);
      if (j < k) {
        lo = j + 1;
      } else if (j > k) {
        hi = j - 1;
      } else {
        return a[k];
      }
    }
    return a[k];
  }

  private static int partition(Comparable[] a, int lo, int hi) {
    int i = lo, j = hi + 1;
    while (true) {
      while (less(a[++i], a[lo])) {
        if (i == hi) {
          break;
        }
      }
      while (less(a[lo], a[--j])) {
        if (j == lo) {
          break;
        }
      }

      if (i >= j) {
        break;
      }
      exch(a, i, j);
    }
    exch(a, lo, j);
    return j;
  }

  private static void exch(Comparable[] a, int i, int j) {
    Comparable t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  private static boolean less(Comparable comparable, Comparable comparable1) {
    return comparable.compareTo(comparable1) < 0;
  }
}
