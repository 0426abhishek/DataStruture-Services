package com.linkList;

public class Main {
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        for (int i = 1; i <= 10; i++) {
//            // LinkedList prepend call
//            // linkedList.prepend(i);
//            // LinkedList append call
//            linkedList.append(i);
//        }
//        System.out.println(linkedList);
//        System.out.println(linkedList.getSize());
//        linkedList.insertAt(5, 20);
//        linkedList.removeAt(5);
//        // linkedList.removeLast();
//        System.out.println(linkedList);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        for (int i = 0 ; i <=10 ; i++){
            doublyLinkedList.append(i);
        }
        System.out.println(doublyLinkedList);
        doublyLinkedList.removeLast();
        System.out.println(doublyLinkedList);
        doublyLinkedList.insertAt(4, 20);
        System.out.println(doublyLinkedList);
        doublyLinkedList.removeAt(4);
        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.printReverse());
    }
}
