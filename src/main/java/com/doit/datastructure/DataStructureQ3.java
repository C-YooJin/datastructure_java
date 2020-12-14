package com.doit.datastructure;

import java.util.Scanner;

public class DataStructureQ3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for(int i=0; i<a.length; i++)
            sum += a[i];
        return sum;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟 수 입력:");
        int num = stdIn.nextInt();

        int[] a = new int[num];

        for(int i = 0; i < a.length; i++) {
            System.out.println("요소 값 입력: ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("모든 요소의 합: " + sumOf(a));
    }
}
