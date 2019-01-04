package com.company.linkedList.sortedLinkedlist;

public class SortedLinkedList {

    Node head = null;
    public Node removeDuplicateElement() {
        if (head == null) {
            return head;
        }
        Node tmp = head;
        while (tmp.next != null) {
            if (tmp.data == tmp.next.data) {
                System.out.println("tmp.data = " + tmp.data);
                System.out.println("tmp.next.data = " + tmp.next.data);
                tmp.next = tmp.next.next;
            }else {
                tmp = tmp.next;
            }


        }
        return head;
    }
}
