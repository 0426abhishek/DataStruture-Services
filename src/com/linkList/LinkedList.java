package com.linkList;

public class LinkedList {
    private Node header;
    private Node lastNode;
    private int size;

    public LinkedList() {
        header = new Node(null);
        lastNode = header;
    }

    public void prepend(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
            size++;
        } else {
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            size++;
        }
    }

    public void append(Integer data) {
        Node n = new Node(data);
        if (size == 0) {
            header.next = n;
            lastNode = n;
            size++;
        } else {
            lastNode.next = n;
            lastNode = n;
            size++;
        }
    }

    public void removeFirst() {
        if (size != 0) {
            header.next = header.next.next;
            size--;
        }
    }

    public void removeLast() {
        if(size == 1){
            header.next=null;
            lastNode = header;
            size--;
        }
        else if (size != 0) {
            Node n = header.next;
            int count = 1;
            while (count != size - 1) {
                n = n.next;
                count++;
            }
            lastNode = n;
            lastNode.next = null;
            size--;
        }
    }

    public void insertAt(int index, Integer data) {
        if (index <= 0 || index > size)
            return;
        else if (index == 1)
            prepend(data);
        else if (index == size)
            append(data);
        else {
            Node n = new Node(data);
            Node x = header.next;
            int count = 1;
            while (count != index - 1) {
                x = x.next;
                count++;
            }
            Node temp = x.next;
            x.next = n;
            n.next = temp;
            size++;
        }
    }

    public void removeAt(int index) {
        if (index <= 0 || index > size)
            return;
        else if (index == 1)
            removeFirst();
        else if (index == size)
            removeLast();
        else {
            Node n = header.next;
            int count = 1;
            while (count != index - 1) {
                n = n.next;
                count++;
            }
            n.next = n.next.next;
            size--;
        }

    }

    public int getSize() {
        return size;
    }

    public String toString() {
        Node n = header.next;
        String temp = "";
        while (n != null) {
            temp = temp + n.data + " ";
            n = n.next;
        }
        return temp;
    }
}
