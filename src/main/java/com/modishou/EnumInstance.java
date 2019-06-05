package com.modishou;

/**
 * @Author: modishou
 * @Date: 2019/6/3 15:52
 */
public enum EnumInstance {

    INSTANCE;

    private String a;
    private String b;


    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static void main(String[] args) {
        EnumInstance instance = EnumInstance.INSTANCE;
        instance.setA("3");
        System.out.println(instance.getA());
    }
}
