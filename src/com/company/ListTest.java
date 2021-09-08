package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    List list = new List();
    List list1 = new List();

    @BeforeEach
    void setUp() {
        list1.insertFromTail(new Node("0"));
        list1.insertFromTail(new Node("1"));
        list1.insertFromTail(new Node("2"));
        list1.insertFromTail(new Node("3"));
        list1.insertFromTail(new Node("4"));
    }

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
        assertEquals(null,list.removeFromHead());
        Node n =new Node("1");
        Node n1 = new Node("2");
        Node n2 = new Node("3");
        list.insertFromHead(n);
        assertEquals("1",list.removeFromHead().name);
        list.insertFromHead(n1);
        list.insertFromHead(n2);
        assertEquals("3",list.removeFromHead().name);
        assertEquals("1",list.removeFromTail().name);
        System.out.println(list.printFromHead());
    }

    @Test
    void removeFromTail() {
        list.insertFromTail(new Node("1"));
        list.insertFromTail(new Node("2"));
        list.insertFromTail(new Node("3"));
        list.insertFromTail(new Node("4"));
        assertEquals("4",list.removeFromTail().name);
    }

    @Test
    void printFromHead() {
        list.insertFromTail(new Node("1"));
        list.insertFromTail(new Node("2"));
        list.insertFromTail(new Node("3"));
        list.insertFromTail(new Node("4"));
        System.out.println(list.printFromHead());
    }

    @Test
    void printFromTail() {
        System.out.println(list1.printFromTail());
    }

    @Test
    void findNode() {
        assertEquals("",list1.findNode("6").name);
    }

    @Test
    void findNodeByIndex() {
        System.out.println(list1.findNodeByIndex(1).name);
    }

    @Test
    void removeFromList() {
        assertEquals("1",list1.removeFromList("1").name);
        System.out.println(list1.printFromHead());
    }

    @Test
    void insertToList() {
        Node nTest =new Node("9");
        list1.insertToList(2,nTest);
        System.out.println(list1.printFromHead());
    }

    @Test
    void listSize() {
        assertEquals(4,list1.listSize());
    }
}