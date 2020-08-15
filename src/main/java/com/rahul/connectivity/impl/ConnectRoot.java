package com.rahul.connectivity.impl;

import com.rahul.connectivity.IConnection;

public class ConnectRoot implements IConnection {

  private static int[] array;

  public ConnectRoot(int n) {
    array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = i;
    }
  }

  @Override
  public void connect(int p, int q) {
    int rootP = root(p);
    int rootQ = root(q);
    array[rootP]=rootQ;
  }

  @Override
  public boolean connected(int p, int q) {
    return root(p)==root(q);
  }

  private int root(int k) {
    while (k != array[k]) {
      k = array[k];
    }
    return k;
  }
}
