package test;

import datastruct.XYArray;
import org.junit.Test;

public class ArrayTest {


    /**
     * 添加测试
     */
    @Test
    public void addTest() {
        XYArray<Integer> array = new XYArray<>(10);
        for (int i = 0; i < array.getCapacity(); i++) {
            array.addAtLast(i);
        }
        array.addAtLast(1);
        array.addAtFirst(2);
        array.insert(1, 3);
        System.out.println("预期:[2,3,0,1,2,3,4,5,6,7,8,9,1]");
        System.out.print("实际:");
        System.out.println(array);
        System.out.println("------------------");
    }

    /**
     * 添加测试
     */
    @Test
    public void updateTest() {
        XYArray<Integer> array = new XYArray<>(10);
        for (int i = 0; i < array.getCapacity(); i++) {
            array.addAtLast(i);
        }
        array.set(0, 9);
        array.set(9, 5);
        System.out.println("预期:[9,1,2,3,4,5,6,7,8,9]");
        System.out.print("实际:");
        System.out.println(array);
        System.out.println("------------------");
    }


    /**
     * 删除方法测试
     */
    @Test
    public void deleteTest() {
        XYArray<Integer> array = new XYArray<>(10);
        for (int i = 0; i < array.getCapacity(); i++) {
            array.addAtLast(i);
        }
        array.delete(1);
        array.deleteFirst();
        array.deleteLast();
        System.out.println("预期:[2,3,4,5,6,7,8]");
        System.out.print("实际:");
        System.out.println(array);
        System.out.println("------------------");
    }

    /**
     * getByIndex测试
     */
    @Test
    public void getTest(){
        XYArray<Integer> array = new XYArray<>(10);
        for (int i = 0; i < array.getCapacity(); i++) {
            array.addAtLast(i);
        }
        int size = array.getSize();
        int capacity = array.getCapacity();

        Integer byIndex = array.getByIndex(8);
        System.out.println("该位置的值为：" + byIndex + ",数组容量为:" + capacity + ",数组元素个数为:" + size);
    }



}
