package com.rahul.search.impl;

import com.rahul.search.ISearch;

public class BinarySearch<T extends Comparable<T>> implements ISearch<T> {

  public int search(T[] array, T elem) {
    int lo = 0, hi = array.length - 1;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (array[mid].compareTo(elem) == 0) {
        return mid;
      }
      if (array[mid].compareTo(elem) < 0) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    return -1;
  }

}
