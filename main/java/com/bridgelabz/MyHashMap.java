package com.bridgelabz;

public class MyHashMap<K, V> {
    //Called linked list to do the Hash Table Operation
    MyLinkedList<K> myList;
    public MyHashMap() {
        this.myList = new MyLinkedList<>();
    }
    //Getting and adding values
    public V get(K key) {
        MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();

    }
    public void add(K key, V value) {
        MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myList.search(key);
        if(mapNode == null) {
            mapNode = new MyHashMapNode<>(key, value);
            this.myList.append(mapNode);
        }
        else {
            mapNode.setValue(value);
        }
    }

    //returning the list
    @Override
    public String toString() {
        return "MyHashMapNodes{ "+myList+" }";
    }
}

