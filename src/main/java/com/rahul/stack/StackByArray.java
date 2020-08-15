package com.rahul.stack;

import java.util.NoSuchElementException;

public class StackByArray<T> implements IStack<T> {

  private T[] array;
  private int n = 0;

  public StackByArray(int capcity) {
    array = (T[]) new Object[capcity];
  }


  @Override
  public void push(T t) {
    if (n == array.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    array[n++] = t;
  }

  @Override
  public T pop() {
    if (n == 0) {
      throw new NoSuchElementException();
    }
    T elem = array[--n];
    array[n] = null;
    return elem;
  }

  @Override
  public boolean isEmpty() {
    return n == 0;
  }
}
