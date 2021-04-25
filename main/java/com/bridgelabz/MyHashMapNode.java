package com.bridgelabz;

public class MyHashMapNode<K, V> implements INode<K> {

    //Created mymapnode with key value pair
    K key;
    V value;
    MyHashMapNode<K, V> next;

    public MyHashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    //getting key
    public K getKey() {
        return key;
    }

    @Override
    //setting key
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = (MyHashMapNode<K, V>) next;
    }

    //getting the value
    public V getValue() {
        return value;
    }
    //setting the value
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder mapNode = new StringBuilder();
        mapNode.append("MyHashMapNode { " + " K = ").append(key).append(" V = ").append(value).append(" } ");
        if(next != null) {
            mapNode.append("->").append(next);
        }
        return mapNode.toString();
    }

}
