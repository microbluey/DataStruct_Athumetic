package com.microblueworld.test.datastruct;

import com.microblueworld.datastruct.LinkedListQueue;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListQueueTest {

    @Test
    public void isEmpty() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        System.out.println(queue.isEmpty());
        queue.enqueue("abc");
        System.out.println(queue.isEmpty());
    }

    @Test
    public void size() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        System.out.println(queue.size());
        queue.enqueue("abc");
        System.out.println(queue.size());
    }

    @Test
    public void enqueue() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        queue.enqueue("abc");
        for (String s : queue) {
            System.out.println(s);
        }
    }

    @Test
    public void dequeue() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        System.out.println(queue.size());
        queue.enqueue("abc");
        System.out.println(queue.size());
        String dequeue = queue.dequeue();
        System.out.println(dequeue);
        System.out.println(queue.size());
    }
}