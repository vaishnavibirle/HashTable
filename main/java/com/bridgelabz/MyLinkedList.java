package com.bridgelabz;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    //Created linked list for all operations to be performed
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    //Added the node
    public void add(INode<K> newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //Appending
    public void append(INode<K> myNode) {
        if(this.head == null) {
            this.head = myNode;
        }
        if(this.tail == null) {
            this.tail = myNode;
        }
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode<K> popLast() {
        INode<K> tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while(tempNode != null && tempNode.getNext() != null) {
            if(tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void printMyNodes() {
        System.out.println("My nodes are: "+ head);
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{ "+head+" }";
    }
}
