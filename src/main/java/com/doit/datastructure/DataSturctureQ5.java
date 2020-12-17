package com.doit.datastructure;

import java.util.Scanner;

public class DataSturctureQ5 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static int reverse(int[] b) {
        for(int i = 0; i<b.length; i++) {
            swap(b, i, b.length-i-1);
        }
        return b;
    }

    static void rcopy(int[] a, int[] b){
        for(int i=0; i<b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요소 수 입력:");

        int num = stdIn.nextInt();

        int[] b = new int[num];

        for(int i = 0; i < num; i++){
            System.out.println("b[" + i + "]: ");
            b[i] = stdIn.nextInt();
        }

        reverse(b);
        rcopy();

    }
}
