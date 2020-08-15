package com.rahul.connectivity.impl;

import com.rahul.connectivity.IConnection;

public class ConnectBruteForce implements IConnection {

  private static int[] array;

  public ConnectBruteForce(int n) {
    array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = i;
    }
  }

  @Override
  public void connect(int p, int q) {
    int idp = array[p];
    int idq = array[q];
    for (int i = 0; i < array.length; i++) {
      if (array[i] == idp) {
        array[i] = idq;
      }
    }
  }

  @Override
  public boolean connected(int p, int q) {
    return array[p] == array[q];
  }
}
