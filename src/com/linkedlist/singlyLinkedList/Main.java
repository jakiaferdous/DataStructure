package com.linkedlist.singlyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();



        list.insertNodeFirst(2);
        list.insertNodeFirst(3);
        list.insertNodeFirst(4);
        list.insertNodeFirst(5);
        list.insertNodeLast(6);
        list.insertNodeLast(7);
        list.insertNodeLast(8);

        list.printData();

    }
}
