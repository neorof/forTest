package com.modishou.tree;

/**
 * @Author: modishou
 * @Date: 2019/6/23 16:38
 */
public class DataNode<T> {

    private T data;
    private DataNode lChild;
    private DataNode rChild;

    public DataNode getlChild() {
        return lChild;
    }

    public void setlChild(DataNode lChild) {
        this.lChild = lChild;
    }

    public DataNode getrChild() {
        return rChild;
    }

    public void setrChild(DataNode rChild) {
        this.rChild = rChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
