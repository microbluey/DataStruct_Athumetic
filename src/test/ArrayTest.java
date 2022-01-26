package test;

import datastruct.XYArray;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        XYArray<Integer> array = new XYArray<>(10);
        array.addAtLast(1);
        array.addAtFirst(2);
        array.insert(1,3);
        System.out.println("预期:[2,3,1]");
        System.out.print("实际:");
        System.out.println(array);
        System.out.println("------------------");

        array.delete(1);
        System.out.println("预期:[2,1]");
        System.out.print("实际:");
        System.out.println(array);
        System.out.println("------------------");
    }
}
