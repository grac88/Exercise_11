package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String str = scan.nextLine();
        double num1 = Double.valueOf(str);
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        double num3 = num2;
        int result = Double.compare(num1, num3);
        if (result == 0)
            System.out.println("Значения равны");
        else if (result == 1)
            System.out.println("Большее число " + num1);
        else
            System.out.println("Большее число " + num3);
        double result2 = Math.min(num1, num3);
        if (num1 != num3)
            System.out.println("Меньшее число " + result2);
    }
}
