package com.hongna.JVM;

public class T2 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        t1.start();
        // 不合法的多线程操作

    }
}
 