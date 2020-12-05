package com.doit.basicalgorithm;

import java.util.Scanner;

public class Q1 {
    static int main(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a 입력: ");
        int a = stdIn.nextInt();
        System.out.println("b 입력: ");
        int b = stdIn.nextInt();
        System.out.println("c 입력: ");
        int c = stdIn.nextInt();
        System.out.println("d 입력: ");
        int d = stdIn.nextInt();

        int max = main(a, b, c, d);

        System.out.println("결과는 두구두구: " + max);
    }

}
