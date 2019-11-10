package com.modishou.array;

public class TestArray {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(find(5, intArray));
        System.out.println(find1(1, intArray, 0, intArray.length - 1));
    }

    public static int find1(int target, int[] intArray, int begin, int end) {
        int cur = (begin + end) / 2;
        if (intArray[cur] == target) {
            return cur;
        } else if (intArray[cur] > target){
            return find1(target, intArray, begin, cur -1);
        } else {
            return find1(target, intArray, cur + 1, end);
        }
    }

    public static int find(int target, int[] array) {
        int begin = 0;
        int end = array.length - 1;

        int cur;
        int curVal;

        while (begin <= end) {
            cur = (begin + end) / 2;
            curVal = array[cur];
            if (curVal == target) {
                return cur;
            } else if (target < curVal) {
                end = cur - 1;
            } else {
                begin = cur + 1;
            }
        }
        return -1;
    }
}
