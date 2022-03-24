package com.microblueworld.datastruct;

import java.util.Iterator;

/**
 * 下压栈（基于可动态调整大小数组实现）
 * @param <T> 栈元素类型
 */
public class ResizingSizeArrayStack<T> implements Iterable<T> {
    /**
     * 栈元素个数
     */
    private int size;
    /**
     * 栈容量
     */
    private int capital = 16;
    /**
     * 栈元素
     */
    private T[] items = (T[]) new Object[capital];

    /**
     * 空参构造器
     */
    public ResizingSizeArrayStack(){}

    /**
     * 创建指定容量的栈
     * @param capital 容量
     */
    public ResizingSizeArrayStack(int capital){
        this.capital = capital;
    }

    /**
     * 获取栈元素个数
     * @return 栈元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取栈容量
     * @return 栈容量
     */
    public int getCapital(){
        return capital;
    }

    /**
     * 判断是否为空
     * @return 判断栈是否为空
     */
    public boolean isEmpty(){
        if (items == null || items.length == 0 || size == 0){
            return true;
        }
        return false;
    }

    /**
     * 调整栈容量
     * @param max 目标栈容量
     */
    private void resize(int max){
        T[] resized = (T[]) new Object[max];
        for (int i = 0; i < size; i++) {
            resized[i] = items[i];
        }
        items = resized;
    }

    /**
     * 压栈
     * @param item 压栈元素
     */
    public void push(T item){
        if (size >= capital){
            resize(2 * capital);
        }
        items[size++] = item;
    }

    /**
     * 出栈
     * @return 出栈元素
     */
    public T pop(){
        T item = items[--size];
        items[size] = null;
        if (size > 0 && size <= items.length / 4){
            resize(items.length / 2);
        }
        return item;
    }

    /**
     * 获取迭代器
     * @return 迭代器
     */
    @Override
    public Iterator<T> iterator() {
        return new ReverseIerator();
    }

    /**
     * 反转迭代器
     */
    private class ReverseIerator implements Iterator<T>{

        private int i = size;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return items[--i];
        }
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        ResizingSizeArrayStack<String> stack = new ResizingSizeArrayStack<>(10);
        System.out.println(stack.isEmpty());
        stack.push("wade");
        stack.push("microbluey");
        for (String s : stack) {
            System.out.println(s);
        }
        String pop = stack.pop();
        for (String s : stack) {
            System.out.println(s);
        }

    }


}
