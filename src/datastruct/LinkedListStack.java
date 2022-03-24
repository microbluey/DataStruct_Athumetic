package datastruct;

/**
 * 基于链表的栈结构实现
 * @param <T>
 */
public class LinkedListStack<T> {

    /**
     * 栈顶
     */
    private Node<T> first;
    /**
     * 栈元素数量
     */
    private int N;

    /**
     * 判断栈是否为空
     * @return true: 为空，false:不为空
     */
    public boolean isEmpty(){
        return  !(N > 0);
    }

    /**
     * 入栈
     * @param value 入栈元素
     */
    public void push(T value){
        Node<T> oldFirst = first;
        first = new Node<>();
        first.value = value;
        first.next = oldFirst;
        N++;
    }

    /**
     * 出栈
     * @return 栈顶元素出栈
     */
    public T pop(){
        T oldFirst = first.value;
        first = first.next;
        N--;
        return oldFirst;
    }

    /**
     * 节点类
     * @param <T>
     */
    private class Node<T>{
        /**
         * 下个节点
         */
        Node next;
        /**
         * 当前节点值
         */
        T value;
    }
}
