package com.rahul.queue;


import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IQueueTest {

  @Test
  void testQueueByArrayPushPop() {
    IQueue<Integer> queue = new QueueByArray<>(5);
    Assertions.assertThrows(NoSuchElementException.class, queue::dequeue);
    Assertions.assertTrue(queue.isEmpty());
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    Assertions.assertFalse(queue.isEmpty());
    queue.enqueue(4);
    queue.enqueue(5);
    Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> queue.enqueue(6));
    Assertions.assertEquals(1, queue.dequeue());
    Assertions.assertEquals(2, queue.dequeue());
    Assertions.assertEquals(3, queue.dequeue());
    Assertions.assertEquals(4, queue.dequeue());
    queue.enqueue(6);
    Assertions.assertEquals(5, queue.dequeue());
    Assertions.assertEquals(6, queue.dequeue());
    queue.enqueue(7);
    Assertions.assertEquals(7, queue.dequeue());
  }

  @Test
  void testQueueByReSizePushPop() {
    IQueue<Integer> queue = new QueueByReSizeArray<>();
    Assertions.assertTrue(queue.isEmpty());
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    Assertions.assertFalse(queue.isEmpty());
    queue.enqueue(4);
    queue.enqueue(5);
    Assertions.assertEquals(1, queue.dequeue());
    Assertions.assertEquals(2, queue.dequeue());
    Assertions.assertEquals(3, queue.dequeue());
    Assertions.assertEquals(4, queue.dequeue());
    queue.enqueue(6);
    Assertions.assertEquals(5, queue.dequeue());
    Assertions.assertEquals(6, queue.dequeue());
    queue.enqueue(7);
    Assertions.assertEquals(7, queue.dequeue());
  }

  @Test
  void testQueueByNodePushPop() {
    IQueue<Integer> queue = new QueueByNode<>();
    Assertions.assertTrue(queue.isEmpty());
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    Assertions.assertFalse(queue.isEmpty());
    queue.enqueue(4);
    queue.enqueue(5);
    Assertions.assertEquals(1, queue.dequeue());
    Assertions.assertEquals(2, queue.dequeue());
    Assertions.assertEquals(3, queue.dequeue());
    Assertions.assertEquals(4, queue.dequeue());
    queue.enqueue(6);
    Assertions.assertEquals(5, queue.dequeue());
    Assertions.assertEquals(6, queue.dequeue());
    queue.enqueue(7);
    Assertions.assertEquals(7, queue.dequeue());
  }

}