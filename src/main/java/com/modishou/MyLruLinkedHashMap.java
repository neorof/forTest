package com.modishou;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: modishou
 * @Date: 2019/6/5 13:43
 */
public class MyLruLinkedHashMap<K, V> {

    private final int MAX_SIZE;
    private final float DEFAULT_LOAD_FACTORY = 0.75f;

    private LinkedHashMap<K, V> cache;

    public MyLruLinkedHashMap(int size) {
        this.MAX_SIZE = size;
        //防止达到负载扩容
        int capacity = (int) Math.ceil(MAX_SIZE / DEFAULT_LOAD_FACTORY) + 1;
        cache = new LinkedHashMap<K, V>(capacity, DEFAULT_LOAD_FACTORY, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
                return cache.size() > MAX_SIZE;
            }
        };
    }

    public synchronized void put(K key, V value) {
        cache.put(key, value);
    }

    public synchronized V get(K key) {
        return cache.get(key);
    }

    public synchronized void remove(K key) {
        cache.remove(key);
    }

    public synchronized Set<Map.Entry<K, V>> getAll() {
        return cache.entrySet();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<K, V> entry : cache.entrySet()) {
            stringBuilder.append(String.format("%s: %s  ", entry.getKey(), entry.getValue()));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyLruLinkedHashMap<Integer, Integer> lru1 = new MyLruLinkedHashMap<>(5);
        lru1.put(1, 1);
        lru1.put(2, 2);
        lru1.put(3, 3);
        System.out.println(lru1);
        lru1.get(1);
        System.out.println(lru1);
        lru1.put(4, 4);
        lru1.put(5, 5);
        lru1.put(6, 6);
        System.out.println(lru1);
    }

}
