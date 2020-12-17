package com.doit.basicalgorithm;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("n 입력: "); int n = stdIn.nextInt();

        int sum = 0;
        String result = new String("");

        for(int i = 1; i <= n; i++) {
            sum += i;

        }
    }
}
