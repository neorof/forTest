package com.modishou;

import java.util.ArrayList;
import java.util.List;

public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        List<Integer> list = new ArrayList();
        double MAX_INT = Integer.MAX_VALUE;
        double MIN_INT = Integer.MIN_VALUE;

        System.out.println(MIN_INT == - Math.pow(2, 31));



        while (x != 0) {
            int remain = x % 10;
            x = x / 10;
            list.add(remain);
        }

        long res = 0L;
        for (int i =0; i < list.size(); i++) {
            res += list.get(i) * (Math.pow(10, list.size() - 1 - i));
            if (res > MAX_INT || res < MIN_INT) {
                return 0;
            }
        }

        return Integer.parseInt(res + "");
    }
}
