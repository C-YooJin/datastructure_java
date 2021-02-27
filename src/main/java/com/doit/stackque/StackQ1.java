package com.doit.stackque;

import java.util.Scanner;

public class StackQ1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true) {
            System.out.println("현재 데이터 수: " + s.size() + s.capacity());
            System.out.println("(1)푸시  (2)팝  (3)피크  (4)덤프  (5)종료 : ");
            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.println("데이터 입력 : ");
                    int push = stdIn.nextInt();

                    try{
                        s.push(push);
                    }catch (IntStack.OverflowIntStackException e) {
                        System.out.println("");
                        break;
                    }
                case 2:
                    System.out.println();

            }
        }
    }
}
