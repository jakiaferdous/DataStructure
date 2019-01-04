package com.company;

import com.company.linkedList.singlyLinkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNodeFirst(1);
        list.insertNodeFirst(1);
        list.insertNodeFirst(2);
        list.insertNodeFirst(3);
        list.insertNodeFirst(4);


        list.printData();
    }
}
