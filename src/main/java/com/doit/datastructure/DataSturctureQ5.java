package com.doit.datastructure;

import java.util.Scanner;

public class DataSturctureQ5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요소 수 입력:");

        int num = stdIn.nextInt();

        int[] b = new int[num];

        for(int i = 0; i < num; i++){
            int value = stdIn.nextInt();
            b[i] = value;
        }

        System.out.println(b);
    }
}
