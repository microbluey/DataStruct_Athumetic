package com.microblueworld.athumetic;

public class SortCompare {

    public static double time(String alg,Double[] a){
        long l = System.currentTimeMillis();
        if (alg.equals("InsertionSort")){
            InsertionSort.sort(a);
        }
        if (alg.equals("SelectionSort")){
            SelectionSort.sort(a);
        }
        if (alg.equals("ShellSort")){
            ShellSort.sort(a);
        }
        long l1 = System.currentTimeMillis();
        double v = (l1 - l) / 1000.0;
        return v;

    }
    public static double timeRandomInput(String alg,int N, int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0;t < T; t++){
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args){
        String alg1 = "MergeSort";
        String alg2 = "ShellSort";
        int N = Integer.parseInt("1000");
        int T = Integer.parseInt("100");
        double t1 = timeRandomInput(alg1,N,T);
        double t2 = timeRandomInput(alg2,N,T);
        System.out.printf("For %d random Doubles\n    %s is",N,alg1);
        System.out.printf(" %.1f times faster than %s\n",t2/t1,alg2);
    }
}
