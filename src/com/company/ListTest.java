package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    List list = new List();


    @Test
    void insertFromHead() {
        Node node1 = new Node("1");
        assertEquals("1",list.insertFromHead(node1).name);
    }

    @Test
    void insertFromTail() {
        Node node1 = new Node("1");
        assertEquals("1",list.insertFromTail(node1).name);
    }

    @Test
    void removeFromHead() {
        list.insertFromTail(new Node("1"));
        list.insertFromTail(new Node("2"));
        list.insertFromTail(new Node("3"));
        list.insertFromTail(new Node("4"));
        assertEquals("1",list.removeFromHead().name);
    }

    @Test
    void removeFromTail() {
        list.insertFromTail(new Node("1"));
        list.insertFromTail(new Node("2"));
        list.insertFromTail(new Node("3"));
        list.insertFromTail(new Node("4"));
        assertEquals("4",list.removeFromTail().name);
    }
}