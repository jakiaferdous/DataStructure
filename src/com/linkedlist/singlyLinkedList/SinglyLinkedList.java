package com.linkedlist.singlyLinkedList;

public class SinglyLinkedList {

        Node head;
        int count = 0;

        public boolean isEmpty() {
            return head == null;
        }

        public void insertNodeFirst(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                head = node;
                count++;
            } else {
                node.next = head;
                head = node;
                count++;
            }
        }

        public void insertNodeLast(int data) {

            Node node = new Node(data);
            if (isEmpty()) {
                head = node;
                count++;
            } else {
                Node tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;

                }
                tmp.next = node;
                node.next = null;
                count++;
            }
        }

        public void insertAtIndex(int data, int index) {

            if (index > count) {
                System.out.println("index number is bigger than the size of the linkedlist.");
                return;
            }
            Node node = new Node(data);
            if (isEmpty()) {
                System.out.println("List is Empty and this is the first node.");
                head = node;
                node.next = null;
                count++;
            } else {
                if (index == 0) {
                    node.next = head;
                    head = node;
                    count++;
                } else {
                    Node prePointer = head;
                    Node postPointer = null;
                    for (int i = 0; i < index - 1; i++) {
                        prePointer = prePointer.next;
                    }
                    postPointer = prePointer.next;
                    prePointer.next = node;
                    node.next = postPointer;
                    count++;
                }

            }
        }

        public void totalNodes() {
            System.out.println("Total nodes: " + count);
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

        public void removeFirstNode() {

            if (isEmpty()) {
                System.out.println("Empty");
            } else {
                head = head.next;
                count--;
            }

        }

        public void removeLastNode() {
            if (isEmpty()) {
                System.out.println("Empty");
            } else {

                Node preNode = head;
                Node lastNode = preNode.next;
                while (lastNode.next != null) {
                    preNode = preNode.next;
                    lastNode = lastNode.next;
                }
                preNode.next = null;
                count--;
            }
        }

        public void removeAtIndex(int index) {
            if (isEmpty()) {
                System.out.println("Empty.");
                return;
            } else if (index > count) {
                System.out.println("index number is bigger than the size of the linkedlist.");
                return;
            } else {
                Node preNode = head;
                Node postNode = preNode.next;
                for (int i = 0; i < index - 1; i++) {
                    preNode = preNode.next;
                    postNode = postNode.next;
                }
                preNode.next = postNode.next;
                count--;
            }


        }

        public boolean isDataExists(int data) {

            if (isEmpty()) {
                System.out.println("List is empty.");
            } else {
                Node tmp = head;

                while (tmp.next != null) {
                    if (tmp.data == data) {
                        return true;
                    }
                    tmp = tmp.next;
                }
                if (tmp.data == data) {
                    return true;
                }
            }
            return false;
        }

        //soting a list


    }
