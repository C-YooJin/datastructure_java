package com.doit.datastructure;

import java.util.Scanner;

public class DataStructureQ4 {
    static void copy(int[] a, int[] b) {
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요소 수 입력: ");
        int num = stdIn.nextInt();

        int[] a = new int[num];

        for(int i=0; i<a.length; i++) {
            System.out.println("요소 값 입력: ");
            a[i] = stdIn.nextInt();
        }

        int[] b = new int[num];
        copy(a, b);

    }
}
