package com.company.linkedList.singlyLinkedlist;

import java.util.HashMap;

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
        }
    }

    public void insertAtIndex(int data, int position) throws Exception {
        Node node = new Node(data);
        if (position == 0) {
            node.next = head;
            head = node;

        } else {
            int c = 0;
            Node tmp = head;
            while (tmp.next != null) {
                c++;
                tmp = tmp.next;
            }
            if (position > c + 1) {
                throw new Exception("Position is greater than the length.");
            }
            Node current = head;
            int i = 0;
            while (i < position - 1) {
                current = current.next;
                i++;
            }
            node.next = current.next;
            current.next = node;
        }

    }

    public void printData() {

        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node tmp = head;
            System.out.println(tmp.data);
            while (tmp.next != null) {
                tmp = tmp.next;
                System.out.println(tmp.data);
            }
        }
    }

    public void removeFirstNode() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("Linked list is empty");
        } else {
            head = head.next;
        }
    }

    public void removeLastNode() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("Linked list is empty");
        } else {
            Node pre = head;
            Node tmp = pre.next;
            while (tmp.next != null) {
                pre = pre.next;
                tmp = tmp.next;
            }
            pre.next = null;
        }
    }

    public void removeAtIndex(int index) throws NullPointerException, Exception {

        if (isEmpty()) {
            throw new NullPointerException("List is empty!!");
        }
        if(index == 0){
            head = head.next;
            return;
        }
        int count = 0;
        Node tmp = head;
        while (tmp.next != null) {
            count++;
            tmp = tmp.next;
        }
        if (index > count) {
            throw new Exception("Illigal index.");
        }
        Node preNode = head;
        Node postNode = preNode.next;
        for (int i = 0; i < index - 1; i++) {
            preNode = preNode.next;
            postNode = postNode.next;
        }
        preNode.next = postNode.next;

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
    public void reverseIterative() {

        Node curr = head;
        Node pre = null;
        Node post = null;

        while (curr != null) {

            post = curr.next;
            curr.next = pre;
            pre = curr;
            curr = post;
        }
        head = pre;
    }


    //compare two linked list.
    public boolean compareLists(Node head1, Node head2) {

        if (head1 == null && head2 == null) {
            return true;
        } else {
            while (head1 != null && head2 != null) {

                if (head1.data != head2.data) {
                    return false;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
            if (head1 == null && head2 == null) {
                return true;
            }
        }
        return false;

    }

    public void printReverse(){

        Node tmp = head;
        printReverseRec(tmp);
    }

    public void printReverseRec(Node tmp){

        if (tmp == null){
            return;
        }
        else {
            printReverseRec(tmp.next);
            System.out.println(tmp.data);

        }
    }

    //compare two linked lists;
    boolean CompareLists(Node headA, Node headB) {

        while(headA!= null && headB!=null && headA.data==headB.data) {
            headA = headA.next;
            headB = headB.next;
            return headA == headB;
        }
        return false;
    }

    //compare two linked lists recursion
    boolean compareList(Node headA, Node headB){
        if(headA == null && headB == null){
            return true;
        }
        if(headA != null || headB != null){
            return false;
        }
        if(headA.data == headB.data){
            compareList(headA.next,headB.next);
        }
        return false;


    }


    public Node mergeLists(Node head1, Node head2) {
        if(head1 != null && head2 != null){
            return head1;
        }
        Node dummy = new Node(0);
        Node tmp = dummy;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                tmp.next = head1;
                head1 = head1.next;
            }else if(head1.data > head2.data){
                tmp.next = head2;
                head2 = head2.next;
            }else if(head1.data == head2.data){
                tmp.next = head1;
                head1.next = head2;
                head2 = head2.next;
                head1 = head1.next;

            }
            tmp = tmp.next;
        }

        if(head1 != null){
            tmp.next = head1;
        }
        if(head2 != null){
            tmp.next = head2;
        }
        return dummy.next;

    }

    public void removeDuplicates(){
        HashMap <Integer,Integer> map = new HashMap<>();
        Node tmp = head;
        Node pre = null;

        while (tmp != null){
            if(map.containsKey(tmp.data)){
                pre.next = tmp.next;
            }else {
                map.put(tmp.data, 1);
                pre = tmp;

            }
            tmp = tmp.next;
        }
    }



    Node partition(Node head, int x) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node head1 = null;
        Node tail1 = null;
        Node head2 = null;
        Node tail2 = null;

        while (head != null){
            Node tmp = head.next;
            head.next = null;

            if(head.data < x){
                if(head1 == null){
                    head1 = head;
                    tail1 = head;
                }else {
                    tail1.next =head;
                    tail1 = head;
                }
            }else {
                if(head2 == null){
                    head2 = head;
                    tail2 = head;
                }else {
                    tail2.next =head;
                    tail2 = head;
                }

            }
            head = tmp;
        }
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        return tail1.next= head2;

    }




}







