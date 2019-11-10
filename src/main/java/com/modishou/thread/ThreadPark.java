package com.modishou.thread;

import java.util.concurrent.locks.LockSupport;

public class ThreadPark implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread_park开始");
        LockSupport.park(this);//阻塞当前线程
        System.out.println("Thread_park结束");
    }
}
