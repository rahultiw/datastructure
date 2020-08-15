package com.rahul.connectivity.impl;

import com.rahul.connectivity.IConnection;

public class ConnectRootSizeAndPath implements IConnection {

  private static int[] array;
  private static int[] size;

  public ConnectRootSizeAndPath(int n) {
    array = new int[n];
    size = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = i;
      size[i] = 1;
    }
  }

  @Override
  public void connect(int p, int q) {
    int rootP = root(p);
    int rootQ = root(q);
    if(rootP==rootQ) return;
    if(size[p] < size[q]){
      array[rootP]=rootQ;
      size[rootQ]+=size[rootP];
    } else{
      array[rootQ]=rootP;
      size[rootP]+=size[rootQ];
    }
  }

  @Override
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  private int root(int k) {
    while (k != array[k]) {
      // point the traversed node to grandparent so as to flatten the tree
      array[k]=array[array[k]];
      k = array[k];
    }
    return k;
  }
}
