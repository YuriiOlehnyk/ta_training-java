package com.epam.training.Yurii_Olekhnyk.fundamental.Module_3;
import java.util.Scanner;
public class Snail {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a, b, h;
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();
        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int distance = a - b;
            int r = (h - a) / distance;
            System.out.println(Math.round(r + 1));


        }
    }
}
