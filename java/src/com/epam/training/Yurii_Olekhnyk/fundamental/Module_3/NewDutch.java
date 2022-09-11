package com.epam.training.Yurii_Olekhnyk.fundamental.Module_3;
import java.util.Scanner;
public class NewDutch {
    public static void main(String[] args) {
        System.out.println("Sum: ");
        Scanner scanner = new Scanner(System.in);
        int sum, hum;
        sum = scanner.nextInt();
        hum = scanner.nextInt();
        if(sum < 0){
            System.out.println("Bill total amount cannot be negative");

        } else if (hum <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            int money, pr;
            pr = sum * 10 / 100;
            money = (pr + sum) / hum;
            System.out.println(money);

        }


    }

}
