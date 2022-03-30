package com.microblueworld.athumetic;

import java.util.Scanner;

public class MergeSort {
    private static Comparable[] aux;
    /**
     * 排序方法
     * @param a
     */
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length - 1);
    }

    private static void sort(Comparable[] a,int lo,int hi){
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a,lo,mid);
        sort(a,mid + 1,hi);
        merge(a,lo,mid,hi);
    }

    /**
     * 归并方法
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    public static void merge(Comparable[]a, int lo, int mid,int hi){
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {//复制数组
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid ){//左半数组已用尽
                a[k] = aux[j++];
            }else if(j > hi){//右半shuzu已用尽
                a[k] = aux[i++];
            }else if(less(aux[j],aux[i])){//右侧小于左侧
                a[k] = aux[j++];
            }else {//左侧小于右侧
                a[k] = aux[i++];
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
