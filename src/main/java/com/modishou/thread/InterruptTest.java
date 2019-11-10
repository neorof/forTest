package com.modishou.thread;

public class InterruptTest extends Thread {


        public static void main( String args[] ) throws Exception {
            Thread thread=new Thread(new ThreadPark());
            thread.start();//阻塞当前线程

            thread.interrupt();

            Thread thread2=new Thread(new ThreadUnpark(thread));
            thread2.start();//唤醒被阻塞的线程
        }



}
