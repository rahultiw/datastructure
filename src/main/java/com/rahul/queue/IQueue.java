package com.rahul.queue;

public interface IQueue<T> {
  void enqueue(T t);
  T dequeue();
  boolean isEmpty();

}
