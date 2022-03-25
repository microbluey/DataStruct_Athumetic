package com.microblueworld.datastruct;

import java.util.Iterator;

public class LinkedListQueue<T> implements Iterable<T>{
    /**
     * 队首节点
     */
    private Node<T> firstNode;
    /**
     * 队尾节点
     */
    private Node<T> lastNode;
    /**
     * 队列元素数量N
     */
    private int N;

    /**
     * 非空判断
     * @return true:空 false:不为空
     */
    public boolean isEmpty(){return firstNode == null;}

    public int size(){return N;}
    /**
     * 入队
     * @param item 入队元素
     */
    public void enqueue(T item){
        Node<T> oldLastNode = lastNode;
        lastNode = new Node<>();
        lastNode.value = item;
        lastNode.next = null;
        if (isEmpty()){
            firstNode = lastNode;
        }else{
            oldLastNode.next = lastNode;
        }
        N++;
    }

    /**
     * 出队
     * @return 出队元素
     */
    public T dequeue(){
        T value  = firstNode.value;
        firstNode = firstNode.next;
        if (isEmpty()){
            lastNode = null;
        }
        N--;
        return value;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinedListIterator();
    }

    private class LinedListIterator implements Iterator<T>{
        private Node<T> current = firstNode;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }
    }

    private class Node<T>{
        private T value;
        private Node<T> next;
    }
}
