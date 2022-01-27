package datastruct;

public class XYNode<T> {
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
