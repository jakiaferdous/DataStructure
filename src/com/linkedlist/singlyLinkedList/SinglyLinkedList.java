package com.linkedlist.singlyLinkedList;

public class SinglyLinkedList {

    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertNodeFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void insertNodeLast(int data) {

        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;

            }
            tmp.next = node;
            node.next = null;
        }
    }

    public void insertAtIndex(int data, int index) {

        if (isEmpty() && index != 0) {
            System.out.println("List is Empty");
        } else if (isEmpty() && index == 0) {
            Node node = new Node(data);
            head = node;
            node.next = null;
        } else if (!isEmpty() && index == 0) {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }else {
            Node prePointer = head;
            Node postPointer =null;
            for(int i = 0; i < index -1; i++){
                prePointer = prePointer.next;
            }
            postPointer = prePointer.next;
            Node node = new Node(10);
            prePointer.next = node;
            node.next = postPointer;

        }
    }

    public void printData() {

        if (isEmpty()) {
            System.out.println("List is Emplt");
        } else {
            Node tmp = head;
            System.out.println(tmp.data);
            while (tmp.next != null) {
                tmp = tmp.next;
                System.out.println(tmp.data);
            }
        }
    }


}

