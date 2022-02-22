package test;

import datastruct.XYArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class XYArrayTest {

    @Test
    public void getCapacity() {
        XYArray<Integer> array = new XYArray<>(3);
        int capacity = array.getCapacity();
        System.out.println(capacity);
    }

    @Test
    public void getSize() {
        XYArray<Integer> array = new XYArray<>(5);
        int capacity = array.getCapacity();
        int beforeSize = array.getSize();
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        int afterSize = array.getSize();
        System.out.printf("array的容量为%d,\n插入前有效数据个数为%d,\n插入后有效个数为%d\n",capacity,beforeSize,afterSize);
        System.out.println(array);
    }

    @Test
    public void isEmpty() {
        XYArray<Integer> array = new XYArray<>(5);
        int capacity = array.getCapacity();
        System.out.println("数组：" + array);
        System.out.println("数组是否为空：" + array.isEmpty());
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        System.out.println("数组是否为空：" + array.isEmpty());
    }

    @Test
    public void contain() {
        XYArray<Integer> array = new XYArray<>(5);
        System.out.println("数组：" + array);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        if (array.contain(0)){
            System.out.println("包含0");
        }
        if (!array.contain(9)){
            System.out.println("不包含9");
        }
    }

    @Test
    public void find() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        int i = array.find(2);
        if (i == -1){
            System.out.println("不存在");
        }else {
            System.out.println("存在,且元素在" + i + "位置");
        }
    }

    @Test
    public void testToString() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
    }

    @Test
    public void insert() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.insert(1,3);
        System.out.println("数组：" + array);
    }

    @Test
    public void addAtLast() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.addAtLast(3);
        System.out.println("数组：" + array);
    }

    @Test
    public void addAtFirst() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.addAtFirst(3);
        System.out.println("数组：" + array);
    }

    @Test
    public void delete() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.delete(1);
        System.out.println("数组：" + array);
    }

    @Test
    public void deleteLast() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.deleteLast();
        System.out.println("数组：" + array);
    }

    @Test
    public void deleteFirst() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.deleteFirst();
        System.out.println("数组：" + array);
    }

    @Test
    public void set() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.set(1,3);
        System.out.println("数组：" + array);
    }

    @Test
    public void getByIndex() {
        XYArray<Integer> array = new XYArray<>(5);
        array.addAtLast(0);
        array.addAtLast(1);
        array.addAtLast(2);
        System.out.println("数组：" + array);
        array.getByIndex(2);
    }
}