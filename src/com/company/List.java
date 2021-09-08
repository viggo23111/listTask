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
    public String printFromHead() {

        Node n = head;
        String res="";
        while(n!=null){
            res=res + n.name;
            n=n.next;
        }
        return res;
    }

    public String printFromTail() {
        Node n = tail;
        String res = "";
        while (n != null) {
            res = res + n.name;
            n = n.prev;
        }
        return res;
    }

    public boolean isEmpty(){

        return false;

    }

    public Node findNode(String s) {
        Node node = head;
        Node nodeNull = new Node("");
        while (node != null) {
            if (node.name == s){
                return node;
            }
            node = node.next;
        }
        System.out.println("Not found");
        return nodeNull;
    }
    public Node findNodeByIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node removeFromList(String s) {
        Node nodeFound = findNode(s);
        if (head.equals(nodeFound)){
            removeFromHead();
        } else if(tail.equals(nodeFound)){
            removeFromTail();
        }
        else {
            nodeFound.prev.next = nodeFound.next;
            nodeFound.next.prev = nodeFound.prev;
        }
        return nodeFound;

    }

    public Node insertToList(int index, Node node) {
        if(index==0){
            insertFromHead(node);

        }else if (index>=listSize()){
            insertFromTail(node);
        }
        else{
            Node i = findNodeByIndex(index);
            Node p = findNodeByIndex(index-1);

           node.next=i;
           node.prev=i;
           p.next=node;

        }
        return node;
    }

    public int listSize() {
        int size=0;
        Node node = head;
        while(node!=null){
            size++;
            node = node.next;
        }
        return size;
    }
}

