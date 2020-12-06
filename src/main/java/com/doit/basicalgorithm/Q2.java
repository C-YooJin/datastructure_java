package com.doit.basicalgorithm;

import java.util.Scanner;

public class Q2 {
    static int min3(int a, int b, int c) {
        int min = a;

        if (b < min)
            min = b;
        if (c < min)
            min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a 입력: ");
        int a = stdIn.nextInt();
        System.out.println("b 입력: ");
        int b = stdIn.nextInt();
        System.out.println("c 입력: ");
        int c = stdIn.nextInt();

        int min = min3(a, b, c);

        System.out.println("결과는~ 두구두구: " + min);

    }
}
