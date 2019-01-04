package com.company.linkedList.doublyLinkedlist;

public class Node {

    int data;
    public Node pre;
    public  Node next;

    Node(int data,Node pre,Node next){
        this.data = data;
        this.pre = pre;
        this.next = next;
    }
}
