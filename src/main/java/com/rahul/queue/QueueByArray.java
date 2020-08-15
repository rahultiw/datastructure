package com.rahul.queue;

import java.util.NoSuchElementException;

public class QueueByArray<T> implements IQueue<T> {

  private T[] array;
  private int first = 0, last = -1, n = 0;

  public QueueByArray(int capcity) {
    array = (T[]) new Object[capcity];
  }


  @Override
  public void enqueue(T t) {
    if (n == array.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    if (n < array.length && last == array.length - 1) {
      last = 0;
    } else {
      last++;
    }
    array[last] = t;
    n++;
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
