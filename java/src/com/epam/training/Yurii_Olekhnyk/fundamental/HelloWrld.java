package com.epam.training.Yurii_Olekhnyk.fundamental;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class HelloWrld {
    public static void main(String[] args) {
        int [][] array2D = { {1, 2, 3, 4, 5}, {8, 9, 5, 2, 5}, {0, 2, 12, -4, 3} };
        int sum = 0;
        for (int[]row: array2D) {
            for (int element: row) {
                sum = sum + element;
                System.out.print(element + " ");
            }
            System.out.println();


            
        }
        System.out.println("sum = " + sum);

        int[] grades = {10, 8, 9, 5, 6, 7};

        int max = bestGrade(grades);
        System.out.println("All grades : ");
        printAllGrades(grades);
        System.out.println("The highest grade is : " + max);
        System.out.println("The average grade is : " + averageGrade(grades));



    }
    public static void printAllGrades(int @NotNull [] grades) {
        System.out.print("|");
        for (int num : grades) {

            System.out.print(num + "|");
        }
        System.out.println();
    }
    @Contract(pure = true)
    public static double averageGrade(int @NotNull [] numbers) {
        int grade = 0;
        for (int num: numbers) {
            grade = num + grade;
        }
        return ((double) grade / numbers.length);
    }
    public static int bestGrade(int[] numbers) {
        int maxGrade = numbers[0];
        for (int num: numbers) {
            if(num > maxGrade){
                maxGrade = num;
            }

        }
        return maxGrade;
    }


}
