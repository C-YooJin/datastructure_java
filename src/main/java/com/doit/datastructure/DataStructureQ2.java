package com.doit.datastructure;

import java.util.Scanner;

public class DataStructureQ2 {
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        for(int i=0; i < a.length / 2; i++){
            System.out.println(a);
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main() {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소 개수 입력: ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i ++){
            System.out.println("x[" + i + "]");
            int value = stdIn.nextInt();
            x[i] = value;
        }
//        System.out.println(x);

        reverse(x);

        System.out.println(x);
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
