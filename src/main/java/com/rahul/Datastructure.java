package com.rahul;

import com.rahul.connectivity.IConnection;
import com.rahul.connectivity.impl.ConnectBruteForce;
import com.rahul.queue.IQueue;
import com.rahul.queue.QueueByArray;
import com.rahul.queue.QueueByReSizeArray;
import com.rahul.search.ISearch;
import com.rahul.search.impl.BinarySearch;
import com.rahul.stack.IStack;
import com.rahul.stack.StackByArray;
import com.rahul.stack.StackByNode;
import com.rahul.stack.StackByReSizeArray;

public class Datastructure {

  public static void main(String[] args) {
    // write your code here
    //testConnectivity()
    //testBinarySearch();
    //testStackArray();
    //testStackReSizeArray();
    //testStackNode();
    //testQueueArray();
    //testQueueResizeArray();
    testQueueNode();

  }
  private static  void testQueueNode(){
    IQueue<Integer> stack = new QueueByReSizeArray<>();
    stack.enqueue(1);
    stack.enqueue(2);
    stack.enqueue(3);
    stack.enqueue(4);
    stack.enqueue(5);
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    stack.enqueue(6);
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    stack.enqueue(7);
    System.out.println(stack.dequeue());
  }
  private static  void testQueueResizeArray(){
    IQueue<Integer> stack = new QueueByReSizeArray<>();
    stack.enqueue(1);
    stack.enqueue(2);
    stack.enqueue(3);
    stack.enqueue(4);
    stack.enqueue(5);
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    stack.enqueue(6);
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    stack.enqueue(7);
    System.out.println(stack.dequeue());
  }
  private static  void testQueueArray(){
    IQueue<Integer> stack = new QueueByArray<>(5);
    stack.enqueue(1);
    stack.enqueue(2);
    stack.enqueue(3);
    stack.enqueue(4);
    stack.enqueue(5);
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    stack.enqueue(6);
    System.out.println(stack.dequeue());
    System.out.println(stack.dequeue());
    stack.enqueue(7);
    System.out.println(stack.dequeue());
  }
  private static  void testStackNode(){
    IStack<Integer> stack = new StackByNode<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
  private static  void testStackReSizeArray(){
    IStack<Integer> stack = new StackByReSizeArray<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
  private static  void testStackArray(){
    IStack<Integer> stack = new StackByArray<>(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }

  private static void testBinarySearch() {
    ISearch<Integer> search = new BinarySearch<>();
    Integer[] array = new Integer[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
    System.out.println("Found Num at " + search.search(array, 5));
  }

  private static void testConnectivity() {
    System.out.println("Brute Force Connection");
    testConnectBruteForce(10);
    System.out.println("Root Connection");
    testConnectRoot(10);
    System.out.println("Root Size Connection");
    testConnectRootSize(10);
    System.out.println("Root Size and Path Connection");
    testConnectRootSizeAndPath(10);
  }

  private static void testConnectBruteForce(int n) {
    IConnection connection = new ConnectBruteForce(n);
    connection.connect(4, 3);
    connection.connect(3, 8);
    connection.connect(6, 5);
    connection.connect(9, 4);
    System.out.println(connection.connected(8, 9));
    System.out.println(connection.connected(5, 0));
    connection.connect(5, 0);
    connection.connect(7, 2);
    connection.connect(6, 1);
    System.out.println(connection.connected(5, 4));
    System.out.println(connection.connected(4, 8));
    System.out.println(connection.connected(4, 9));

  }

  private static void testConnectRoot(int n) {
    IConnection connection = new ConnectBruteForce(n);
    connection.connect(4, 3);
    connection.connect(3, 8);
    connection.connect(6, 5);
    connection.connect(9, 4);
    System.out.println(connection.connected(8, 9));
    System.out.println(connection.connected(5, 0));
    connection.connect(5, 0);
    connection.connect(7, 2);
    connection.connect(6, 1);
    System.out.println(connection.connected(5, 4));
    System.out.println(connection.connected(4, 8));
    System.out.println(connection.connected(4, 9));

  }

  private static void testConnectRootSize(int n) {
    IConnection connection = new ConnectBruteForce(n);
    connection.connect(4, 3);
    connection.connect(3, 8);
    connection.connect(6, 5);
    connection.connect(9, 4);
    System.out.println(connection.connected(8, 9));
    System.out.println(connection.connected(5, 0));
    connection.connect(5, 0);
    connection.connect(7, 2);
    connection.connect(6, 1);
    System.out.println(connection.connected(5, 4));
    System.out.println(connection.connected(4, 8));
    System.out.println(connection.connected(4, 9));

  }

  private static void testConnectRootSizeAndPath(int n) {
    IConnection connection = new ConnectBruteForce(n);
    connection.connect(4, 3);
    connection.connect(3, 8);
    connection.connect(6, 5);
    connection.connect(9, 4);
    System.out.println(connection.connected(8, 9));
    System.out.println(connection.connected(5, 0));
    connection.connect(5, 0);
    connection.connect(7, 2);
    connection.connect(6, 1);
    System.out.println(connection.connected(5, 4));
    System.out.println(connection.connected(4, 8));
    System.out.println(connection.connected(4, 9));

  }
}
