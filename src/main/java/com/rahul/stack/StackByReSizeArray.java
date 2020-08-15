package com.rahul.stack;

import java.util.NoSuchElementException;

public class StackByReSizeArray<T> implements IStack<T> {

  private T[] array;
  private int n = 0;

  public StackByReSizeArray() {
    array = (T[]) new Object[2];
  }


  @Override
  public void push(T t) {
    if (n == array.length) {
      resize(2*array.length);
    }
    array[n++] = t;
  }

  private void resize(int capcity) {
    T[] newArray = (T[])new Object[capcity];
    System.arraycopy(array, 0, newArray, 0, n);
    array = newArray;
  }

  @Override
  public T pop() {
    if (n == 0) {
      throw new NoSuchElementException();
    }
    if(n== array.length/4){
      resize(array.length/2);
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
