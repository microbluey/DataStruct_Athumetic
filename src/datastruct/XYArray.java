package datastruct;

public class XYArray<T> {
    /**
     * 数组内容
     */
    private T[] data;
    /**
     * 数组内数据个数
     */
    private int size;

    /*
     ********************构造函数********************
     */
    /**
     * 全参构造函数
     * @param capacity 容量
     */
    public XYArray(int capacity){
        this.size = 0;
        this.data = (T[]) new Object[capacity];
    }

    /**
     * 无参构造函数
     * 初始容量为10；
     */
    public XYArray(){
        this(10);
    }
    /*
     ***********************用户操作函数******************
     */
    /**
     * 获取数组容量
     * @return 数组容量
     */
    public int getCapacity(){
        return this.data.length;
    }

    /**
     * 获取数组内数据个数
     * @return 数组内数据个数
     */
    public int getSize(){
        return size;
    }

    /**
     * 判断是否为空
     * @return true为空，false不为空
     */
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    /**
     * 是否包含元素t
     * @param t 目标元素
     * @return true：包含 false:不包含
     */
    public boolean contain(T t){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(t)){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找元素t
     * @param t 目标元素
     * @return >0 目标元素下标，-1 没有该元素
     */
    public int find(T t){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 字符串输出
     * @return 字符串格式    [a,b,c]
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i == size - 1){
                sb.append(']');
            }else {
                sb.append(',');
            }
        }
        return sb.toString();
    }


    /**
     * 指定索引位置插入元素
     * @param index 插入位置
     * @param t 插入元素
     */
    public void insert(int index,T t){
        checkIndexForAdd(index);
        if (size == data.length){
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = t;
        size++;
    }

    /**
     * 数组末尾添加元素
     * @param t 添加的元素
     */
    public void addAtLast(T t){
        insert(size,t);
    }

    /**
     * 数组头部添加元素
     * @param t 添加的元素
     */
    public void addAtFirst(T t){
        insert(0,t);
    }

    /**
     * 删除指定索引的元素
     * @param index 删除元素的位置
     * @return 被删除的元素
     */
    public T delete(int index){
        checkIndex(index);
        T ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        //缩容
        if (size == data.length / 4 && data.length / 2 != 0){
            resize(data.length / 2);
        }
        return ret;
    }

    /**
     * 删除数组末尾元素
     * @return 被删除的元素
     */
    public T deleteLast(){
        return delete(size - 1);
    }

    /**
     * 删除数组头元素
     * @return 被删除的元素
     */
    public T deleteFirst(){
        return delete(0);
    }

    /**
     * 修改指定位置的元素
     * @param index 被修改的索引
     * @param t 修改后的值
     */
    public void set(int index, T t){
        checkIndex(index);
        data[index] = t;
    }


    /**
     * 根据下标获取数组元素
     * @param index 数组下标
     * @return 数组元素
     */
    public T getByIndex(int index){
        checkIndex(index);
        return data[index];
    }

    /*
     **********************************功能函数*************************************
     */
    /**
     * 数组扩容函数
     * @param capacity 新数组容量
     */
    private void resize(int capacity){
        T[] newData = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * 索引检查
     * @param index 索引
     */
    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
    }
    /**
     * 插入索引检查
     * @param index 索引
     */
    private void checkIndexForAdd(int index){
        if (index < 0 || index > size){
            throw new IllegalArgumentException();
        }
    }
}
