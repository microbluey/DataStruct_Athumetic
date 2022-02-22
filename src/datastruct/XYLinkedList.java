package datastruct;

import java.util.LinkedList;

public class XYLinkedList<T> {
    private XYNode head = null;

    /**
     * 在链表尾部添加元素
     * @param value 被添加的元素
     */
    public void insertTail(T value){
        XYNode newNode = new XYNode(value,null);
       insertTail(newNode);
    }
    /**
     * 在链表尾部添加节点
     * @param newNode 被添加的节点
     */
    public void insertTail(XYNode newNode){
        if (head == null){
            head = newNode;
        }else{
            XYNode q = head;
            while (q.getNext() != null){
                q = q.getNext();
            }
            newNode.setNext(q.getNext());
            q.setNext(newNode);
        }
    }

    /**
     * 在链表头插入元素
     * @param newNode 被插入的节点
     */
    public void insertHead(XYNode newNode){
        if (head == null){
            head = newNode;
        }else{
            XYNode q = head.getNext();
            head = newNode;
            newNode.setNext(q);
        }
    }
    /**
     * 在链表头插入元素
     * @param value 被插入的节点的值
     */
    public void insertHead(T value){
        XYNode newNode = new XYNode(value,null);
        insertHead(newNode);
    }

    /**
     * 在p节点后插入新节点
     * @param p 该节点后插入
     * @param newNode 被插入的新节点
     */
    public void insertAfter(XYNode p,XYNode newNode){
        if (p == null){
            return;
        }
        newNode.setNext(p.getNext());
        p.setNext(newNode);
    }
    /**
     * 在p节点后插入新节点
     * @param p 该节点后插入
     * @param value 被插入的新节点的值
     */
    public void insertAfter(XYNode p,T value){
        XYNode newNode = new XYNode(value,null);
        insertAfter(p,newNode);
    }

    /**
     * 在p之前插入
     * @param p
     * @param newNode
     */
    public void insertBefore(XYNode p,XYNode newNode){
        if (p == null){
            return;
        }
        if (p == head){
            insertHead(newNode);
            return;
        }
        XYNode q = head;
        while (q != null && q.getNext() != p){
            q = q.getNext();
        }
        if (q == null){
            return;
        }
        newNode.setNext(p);
        q.setNext(newNode);
    }
    /**
     * 在p之前插入
     * @param p 在p之前插入
     * @param value 插入的节点的值
     */
    public void insertBefore(XYNode p,T value){
        XYNode newNode = new XYNode(value,null);
        insertBefore(p,newNode);
    }

    /**
     * 根据节点删除
     * @param p 被删除的节点
     */
    public void deleteByNode(XYNode p){
        if (p == null || head == null){
            return;
        }
        if (p == head){
            head = head.getNext();
            return;
        }
        XYNode q = head;
        while(q.getNext() != null || q.getNext() != p){
            q = q.getNext();
        }
        q.setNext(q.getNext().getNext());
    }

    /**
     * 根据节点值删除
     * @param value 被删除的值
     */
    public void deleteByValue(T value){
        if (head == null){
            return;
        }
        XYNode p = head;
        XYNode q = null;

        while(p != null && p.getData() != value){
            q = p;
            p = p.getNext();
        }
        if (p == null){
            return;
        }
        if (q == null){
            head = head.getNext();
        }else{
            q.setNext(q.getNext().getNext());
        }
    }

}
class XYNode<T> {
    private T data;
    private XYNode next;

    public XYNode(T data,XYNode next){
        this.data = data;
        this.next = next;
    }

    public T getData(){
        return data;
    }
    public XYNode getNext(){
        return next;
    }
    public void setData(T data){
        this.data = data;
    }
    public void setNext(XYNode next){
        this.next = next;
    }
}


