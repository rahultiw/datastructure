package com.rahul.sort;

public class SelectionSort<T extends Comparable<T>> implements ISort<T> {

  @Override
  public T[] sort(T[] array) {
    return null;

  }

  private boolean less(T t1, T t2) {
    return t1.compareTo(t2) < 0;
  }
}
