package com.microblueworld.athumetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortExample {
    /**
     * 排序方法
     * @param a
     */
    public static void sort(Comparable[] a){

    }

    /**
     * 比较方法
     * @param v
     * @param w
     * @return
     */
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    /**
     * 交换值方法
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[]a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 展示方法
     * @param a
     */
    private static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * 有序判断
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])){
                return false;
            }
        }
        return true;
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String next = scan.nextLine();
        String[] a = next.split(" ");
        sort(a);
        assert isSorted(a);
        show(a);
    }



}
