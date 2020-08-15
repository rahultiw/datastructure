package com.rahul.queue;

public class QueueByNode<T> implements IQueue<T> {

  private Node front;
  private Node rear;

  private class Node {

    T item;
    Node next;
  }


  @Override
  public void enqueue(T t) {
    Node current = rear;
    rear = new Node();
    rear.item = t;
    rear.next = null;
    if(isEmpty()){
      front=rear;
    }else {
      current.next=rear;
    }
  }

  @Override
  public T dequeue() {
    T elem = front.item;
    front = front.next;
    if(isEmpty()){
      rear=null;
    }
    return elem;
  }

  @Override
  public boolean isEmpty() {
    return front == null;
  }
}
