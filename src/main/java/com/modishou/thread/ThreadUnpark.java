package com.modishou.thread;

import java.util.concurrent.locks.LockSupport;

public class ThreadUnpark implements Runnable {

    private Thread thread;

    public ThreadUnpark(Thread thread) {
        this.thread = thread;
    }


    @Override
    public void run() {
        System.out.println("Thread_unpark开始");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LockSupport.unpark(thread);//唤醒被阻塞的线程
        System.out.println("Thread_unpark结束");
    }
}
