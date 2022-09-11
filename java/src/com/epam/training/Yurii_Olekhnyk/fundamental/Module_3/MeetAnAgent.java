package com.epam.training.Yurii_Olekhnyk.fundamental.Module_3;
import java.util.Scanner;
public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {

        //put you code here
        Scanner scanner = new Scanner(System.in);
        int PASSWORD = scanner.nextInt();

        if(PASSWORD== 133976){
            System.out.println("Hello,Agent");
        } else {
            System.out.println("Access denied");

        }

    }
}
