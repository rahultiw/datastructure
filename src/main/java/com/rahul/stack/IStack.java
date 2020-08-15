package com.rahul.stack;

public interface IStack<T> {
  void push(T t);
  T pop();
  boolean isEmpty();

}
