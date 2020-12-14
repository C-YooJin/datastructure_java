package com.doit.datastructure;

import java.util.Scanner;

public class DataStructureQ2 {
    static void swap(int[] a, int idx1, int idx2) {

    }

    static void reverse(){

    }

    public static int main() {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("배열 요솟수 입력: ");
        int num = stdIn.nextInt();

        // 요솟수가 num개인 배열 a 생성
        int[] a = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.println("요소의 값을" + num + "개 입력해주세요 ");
            a[i] = stdIn.nextInt();
        }
    }
}
