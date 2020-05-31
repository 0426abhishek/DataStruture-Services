package com.linkList;

// Node is having rectangle box which is having data and reference
public class Node {
    public Integer data;
    public Node next;
    public Node prev;

    public Node(Integer data) {
        this.data = data;
        next = null;
        prev = null;
    }
}
