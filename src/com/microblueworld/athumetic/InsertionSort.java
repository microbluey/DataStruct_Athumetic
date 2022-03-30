package com.microblueworld.athumetic;

import java.util.Scanner;

/**
 * 插入排序
 */
public class InsertionSort {
    /**
     * 排序方法
     * @param a
     */
    public static void sort(Comparable[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {//参考位向后移动
            for (int j = i; j > 0 && less(a[j],a[j - 1]); j--) {//参考位向前逐步比较大小
                exch(a,j,j-1);
            }
        }
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
