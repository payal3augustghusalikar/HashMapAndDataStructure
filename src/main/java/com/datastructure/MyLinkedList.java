package com.datastructure;

import java.security.Key;

public class MyLinkedList<K> {

    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {

        if (this.tail == null) {
            this.tail = newNode;

        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public INode<K> search(K key) {

        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public INode<K> removeWordFromPhrase(INode<K> node) {

        INode<K> removeNode = search(node.getKey());
        if (removeNode != null) {
            INode<K> tempNode = this.head;
            while (tempNode.getNext() != removeNode) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(removeNode.getNext());
            return removeNode;
        } else
            return null;
    }


    public String toString() {
        return "myLinkedListNodes { " + head + " }";
    }
}

