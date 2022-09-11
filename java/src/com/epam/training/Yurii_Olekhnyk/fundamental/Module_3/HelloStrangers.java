package com.epam.training.Yurii_Olekhnyk.fundamental.Module_3;

import java.util.Scanner;
public class HelloStrangers {
    public static void main(String[] args) {

            System.out.println("Enter the count of strangers: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number == 0)
                System.out.println("Oh, it looks like there is no one here");
            else if (number < 0)
                System.out.println("Seriously? Why so negative?");

            else
                System.out.println("Enter the name of strangers : ");
                String name1, name2, name3;
                scanner.nextLine();
                name1 = scanner.nextLine();
                name2 = scanner.nextLine();
                name3 = scanner.nextLine();
                System.out.println("Hello, " + name1);
                System.out.println("Hello, " + name2);
                System.out.println("Hello, " + name3);











    }
}
