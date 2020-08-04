package com.rahul;

import com.rahul.connectivity.IConnection;
import com.rahul.connectivity.impl.ConnectBruteForce;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Brute Force Connection");
        testConnectBruteForce(10);
        System.out.println("Root Connection");
        testConnectRoot(10);
        System.out.println("Root Size Connection");
        testConnectRootSize(10);
        System.out.println("Root Size and Path Connection");
        testConnectRootSizeAndPath(10);
    }

    private static void testConnectBruteForce(int n){
        IConnection connection = new ConnectBruteForce(n);
        connection.connect(4,3);
        connection.connect(3,8);
        connection.connect(6,5);
        connection.connect(9,4);
        System.out.println(connection.connected(8,9));
        System.out.println(connection.connected(5,0));
        connection.connect(5,0);
        connection.connect(7,2);
        connection.connect(6,1);
        System.out.println(connection.connected(5,4));
        System.out.println(connection.connected(4,8));
        System.out.println(connection.connected(4,9));

    }
    private static void testConnectRoot(int n){
        IConnection connection = new ConnectBruteForce(n);
        connection.connect(4,3);
        connection.connect(3,8);
        connection.connect(6,5);
        connection.connect(9,4);
        System.out.println(connection.connected(8,9));
        System.out.println(connection.connected(5,0));
        connection.connect(5,0);
        connection.connect(7,2);
        connection.connect(6,1);
        System.out.println(connection.connected(5,4));
        System.out.println(connection.connected(4,8));
        System.out.println(connection.connected(4,9));

    }
    private static void testConnectRootSize(int n){
        IConnection connection = new ConnectBruteForce(n);
        connection.connect(4,3);
        connection.connect(3,8);
        connection.connect(6,5);
        connection.connect(9,4);
        System.out.println(connection.connected(8,9));
        System.out.println(connection.connected(5,0));
        connection.connect(5,0);
        connection.connect(7,2);
        connection.connect(6,1);
        System.out.println(connection.connected(5,4));
        System.out.println(connection.connected(4,8));
        System.out.println(connection.connected(4,9));

    }
    private static void testConnectRootSizeAndPath(int n){
        IConnection connection = new ConnectBruteForce(n);
        connection.connect(4,3);
        connection.connect(3,8);
        connection.connect(6,5);
        connection.connect(9,4);
        System.out.println(connection.connected(8,9));
        System.out.println(connection.connected(5,0));
        connection.connect(5,0);
        connection.connect(7,2);
        connection.connect(6,1);
        System.out.println(connection.connected(5,4));
        System.out.println(connection.connected(4,8));
        System.out.println(connection.connected(4,9));

    }
}
