package com.doit.basicalgorithm;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n값 입력:");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }

        System.out.println("i값은: " + i);
    }
}
