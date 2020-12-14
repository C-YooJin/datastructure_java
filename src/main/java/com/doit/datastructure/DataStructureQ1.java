package com.doit.datastructure;

import java.util.Random;
import java.util.Scanner;

public class DataStructureQ1 {
    public static void main() {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("사람 수 입력: ");
        int num = stdIn.nextInt();

        int[] age = new int[num];

        for (int i = 0; i < num; i++) {
            age[i] = rand.nextInt(100);
        }

        System.out.println("결과: " + age);
    }
}
