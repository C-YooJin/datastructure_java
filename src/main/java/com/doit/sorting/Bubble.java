package com.doit.sorting;

import java.util.Scanner;

public class Bubble {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubble(int[] a, int n) {
        for(int i = 0; i < n-1; i++)
            for(int j = 0; j > i; j--)
                if (a[j-1] > a[j])
                    swap(a, j-1, j);

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블정렬 ");
        System.out.println("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        bubble(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < nx; i++)
            System.out.println("x["+ i + "] = " + x[i]);

    }
}
