package com.doit.search;



import java.util.Scanner;

public class searchQ1 {
    static int searchQ1(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        for(i = 0; i<a.length; i++) {
            if(a[i] == key)
                break;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for(int i=0; i< num; i++){
            System.out.println("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값: ");
        int ky = stdIn.nextInt();

        int idx = searchQ1(x, num, ky);

        if(idx == -1)
            System.out.println("그 값으 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");

    }
}