package com.modishou.tree;

public class BinSortTree {

    private Integer data;
    private BinSortTree lChild;
    private BinSortTree rChild;

    public BinSortTree(Integer data, BinSortTree lChild, BinSortTree rChild) {
        this.data = data;
        this.lChild = lChild;
        this.rChild = rChild;
    }

    public BinSortTree(Integer data) {
        this(data, null, null);
    }


    public boolean insert(BinSortTree tree, Integer data) {
        if (tree.data == null) {
            tree.data = data;
        } else if (data > tree.data) {
            if (tree.rChild == null) {
                tree.rChild = new BinSortTree(data);
            } else {
                insert(tree.rChild, data);
            }
        } else if (data < tree.data) {
            if (tree.lChild == null) {
                tree.lChild = new BinSortTree(data);
            } else {
                insert(tree.lChild, data);
            }
        } else {
            System.out.println("data exist:" + data);
            return false;
        }
        return true;
    }

    public void inorder(BinSortTree tree) {
        if (tree != null) {
            inorder(tree.lChild);
            visit(tree);
            inorder(tree.rChild);
        }
    }

    public static void main(String[] args) {
        int[] arr={90,70,55,67,42,98,83,10,45,58};
        BinSortTree tree=new BinSortTree(62);//将第一个数字作为根节点
        for (int i : arr) {
            tree.insert(tree, i);
        }
        tree.inorder(tree);
    }



    public void visit(BinSortTree node) {
        System.out.print(node.data + " ");
    }
}
