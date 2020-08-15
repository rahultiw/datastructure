package com.rahul.queue;

import java.util.NoSuchElementException;

public class QueueByReSizeArray<T> implements IQueue<T> {

  private T[] array;
  private int first = 0, last = -1, n = 0;

  public QueueByReSizeArray() {
    array = (T[]) new Object[2];
  }


  @Override
  public void enqueue(T t) {
    if (n == array.length) {
      resize(2 * array.length);
    }
    if (last == array.length - 1) {
      last = 0;
    } else {
      last++;
    }
    array[last] = t;
    n++;
  }

  private void resize(int capcity) {
    T[] newArray = (T[]) new Object[capcity];
    for (int i = 0, k = first; i <= n - 1; i++) {
      newArray[i] = array[k];
      if (k == array.length - 1) {
        k = 0;
      } else {
        k++;
      }
    }
    array = newArray;
    first = 0;
    last = n - 1;
  }

  @Override
  public T dequeue() {
    if (n == 0) {
      throw new NoSuchElementException();
    }
    T elem = array[first];
    array[first] = null;
    if (n < array.length && first == array.length - 1) {
      first = 0;
    } else {
      first++;
    }
    n--;
    return elem;
  }

  @Override
  public boolean isEmpty() {
    return n == 0;
  }
}
