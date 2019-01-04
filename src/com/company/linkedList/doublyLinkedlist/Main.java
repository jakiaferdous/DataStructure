package com.company.linkedList.doublyLinkedlist;

public class Main {
    public static void main(String[] args) {
       DoublyLinkedListImplementation list = new DoublyLinkedListImplementation();

//        list.addLast(0);
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//
//        System.out.print("before removing :");
//        list.printData();
//        System.out.print("After removing :");
//        list.reverseIterative();

        list.sortedInsert(1);
        list.sortedInsert(3);
//        list.sortedInsert(1);
//        list.sortedInsert(2);
//        list.sortedInsert(3);
//        list.sortedInsert(4);



        list.printData();
    }
}
