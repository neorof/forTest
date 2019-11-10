package com.modishou.tree;

import java.util.Stack;

/**
 * @Author: modishou
 * @Date: 2019/6/23 16:45
 */
public class TestTree {

    public static void main(String[] args) {
        DataNode<Integer> root = new DataNode<>();
        root.setData(1);

        DataNode<Integer> l1Ch = new DataNode<>();
        l1Ch.setData(2);

        DataNode<Integer> r1Ch = new DataNode<>();
        r1Ch.setData(3);

        root.setlChild(l1Ch);
        root.setrChild(r1Ch);

        DataNode<Integer> l2Ch = new DataNode<>();
        l2Ch.setData(4);
        l1Ch.setlChild(l2Ch);

        DataNode<Integer> l3Ch = new DataNode<>();
        l3Ch.setData(5);
        l1Ch.setrChild(l3Ch);

        DataNode<Integer> r2Ch = new DataNode<>();
        r2Ch.setData(6);
        r1Ch.setrChild(r2Ch);

        //        rootFirst(root);
        noDiGui(root);
    }

    public static void rootFirst(DataNode dataNode) {
        if (dataNode != null) {
            System.out.println(dataNode.getData());
            rootFirst(dataNode.getlChild());
            rootFirst(dataNode.getrChild());
        }
    }

    public static void noDiGui(DataNode dataNode) {
        Stack<DataNode> stack = new Stack<>();
        DataNode tmp = dataNode;
        while (tmp != null || !stack.isEmpty()) {
            if (tmp != null) {
                stack.push(tmp);
                tmp = tmp.getlChild();
            } else {
                tmp = stack.pop();

                System.out.println(tmp.getData());

            }

        }
    }
}
