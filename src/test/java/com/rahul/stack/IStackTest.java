package com.rahul.stack;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IStackTest {

  @Test
  void teststackByArrayPushPop() {
    IStack<Integer> stack = new StackByArray<>(5);
    Assertions.assertThrows(NoSuchElementException.class, stack::pop);
    Assertions.assertTrue(stack.isEmpty());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    Assertions.assertFalse(stack.isEmpty());
    stack.push(4);
    stack.push(5);
    Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> stack.push(6));
    Assertions.assertEquals(5, stack.pop());
    Assertions.assertEquals(4, stack.pop());
    Assertions.assertEquals(3, stack.pop());
    Assertions.assertEquals(2, stack.pop());
    stack.push(6);
    Assertions.assertEquals(6, stack.pop());
    Assertions.assertEquals(1, stack.pop());
    stack.push(7);
    Assertions.assertEquals(7, stack.pop());
  }

  @Test
  void teststackByReSizePushPop() {
    IStack<Integer> stack = new StackByReSizeArray<>();
    Assertions.assertTrue(stack.isEmpty());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    Assertions.assertFalse(stack.isEmpty());
    stack.push(4);
    stack.push(5);
    Assertions.assertEquals(5, stack.pop());
    Assertions.assertEquals(4, stack.pop());
    Assertions.assertEquals(3, stack.pop());
    Assertions.assertEquals(2, stack.pop());
    stack.push(6);
    Assertions.assertEquals(6, stack.pop());
    Assertions.assertEquals(1, stack.pop());
    stack.push(7);
    Assertions.assertEquals(7, stack.pop());
  }

  @Test
  void teststackByNodePushPop() {
    IStack<Integer> stack = new StackByNode<>();
    Assertions.assertTrue(stack.isEmpty());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    Assertions.assertFalse(stack.isEmpty());
    stack.push(4);
    stack.push(5);
    Assertions.assertEquals(5, stack.pop());
    Assertions.assertEquals(4, stack.pop());
    Assertions.assertEquals(3, stack.pop());
    Assertions.assertEquals(2, stack.pop());
    stack.push(6);
    Assertions.assertEquals(6, stack.pop());
    Assertions.assertEquals(1, stack.pop());
    stack.push(7);
    Assertions.assertEquals(7, stack.pop());
  }
}