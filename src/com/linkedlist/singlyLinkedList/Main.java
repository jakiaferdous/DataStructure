package com.linkedlist.singlyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();



        //list.insertNodeFirst(3);
        //list.insertNodeFirst(2);
        list.insertAtIndex(4,0);
//        list.insertNodeFirst(1);
//        list.insertNodeFirst(0);
//        list.insertNodeLast(5);
//        list.insertNodeLast(6);
//        list.insertNodeLast(7);
//        list.insertNodeLast(8);
//        list.removeFirstNode();
//        list.removeLastNode();
//        list.removeAtIndex(6);




        list.printData();
        list.totalNodes();
        boolean isDataExist = list.isDataExists(2);
        System.out.println(isDataExist);


    }
}
