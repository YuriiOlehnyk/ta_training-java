package com.epam.training.Yurii_Olekhnyk.fundamental.Module_3;
import java.util.Scanner;
public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guys, pieces;
        System.out.println("Enter amount of guys: ");
        guys = scanner.nextInt();
        System.out.println("How many pieces in 1 pizza?");
        pieces = scanner.nextInt();


        int gcd = 1;
        for (int i = 1; i <= guys && i <= pieces; ++i){
            if (guys % i == 0 && pieces % i == 0)
                gcd = i;

        }
        int lcm = (guys * pieces) / gcd; // НОК тобто кількість всіх шматочків
        int pizza = lcm / pieces; // Кількість всіх шматочків ділимо на кількість шматочків в 1 піці
        System.out.println("Amount of pizza: " + pizza);




    }









}
