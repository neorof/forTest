package com.modishou;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: modishou
 * @Date: 2019/1/20 12:06
 */
public class Abb {

    private Abb(){}

    private static final AtomicReference<Abb> abbAtomicReference = new AtomicReference<>();


    public static Abb getInstance() {
        for (;;) {
            Abb instance = abbAtomicReference.get();
            if (instance != null) {
                return instance;
            }
            instance = new Abb();
            if (abbAtomicReference.compareAndSet(null, instance)) {
                return instance;
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("+++---");
        System.out.println("7");
        System.out.println("8");
    }
}
