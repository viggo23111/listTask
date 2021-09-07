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
}

