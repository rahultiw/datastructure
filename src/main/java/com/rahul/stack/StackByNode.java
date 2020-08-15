package com.rahul.stack;

public class StackByNode<T> implements IStack<T> {

  private Node top;

  private class Node {
    T item;
    Node next;
  }


  @Override
  public void push(T t) {
    Node node = new Node();
    node.item = t;
    node.next = top;
    top = node;
  }

  @Override
  public T pop() {
    T elem = top.item;
    top = top.next;
    return elem;
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }
}
