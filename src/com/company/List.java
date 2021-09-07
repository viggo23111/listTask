package com.company;

public class List {
    Node head = null;
    Node tail = null;

    public Node insertFromHead(Node n){
        if (head == null){
            head=n;
            tail=n;
            return head;
        }
        head.prev=n;
        n.next=head;
        head=n;
        return head;
    }

    public Node insertFromTail(Node n){
        if (tail == null){
            head=n;
            tail=n;
            return tail;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
        return tail;
    }

    public Node removeFromHead() {
        if (head == null){
            return null;
        }
        if (head.equals(tail)){
            return head;
        }
        Node n = head;
        head.next.prev = null;
        head = head.next;
        return n;
    }
    public Node removeFromTail() {
        if (head == null){
            return null;
        }
        if (head.equals(tail)){
            return head;
        }
        Node n = tail;
        tail.prev.next = null;
        tail = tail.prev;
        return n;
    }
    public boolean isEmpty(){

        return false;

    }
}

