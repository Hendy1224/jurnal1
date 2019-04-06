package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner hs = new Scanner(System.in);
        int n;
        int hasil=0;
        System.out.print("Input: \n");
        n = hs.nextInt();

        System.out.println("\nOutput: ");
        for (int i = 1; i <= n; i++) {
            int x = cari(i);
            hasil += x;
            System.out.print(x + " ");
        }
        System.out.println("\n\nHasil: "+hasil);
    }

    public static int cari(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cari(n - 1) + cari(n - 2);
        }
    }
}
