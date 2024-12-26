package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        boolean isValidInput = false;
        while (!isValidInput)
        {
            System.out.print("Введите первое целое число: ");
            String input1 = scanner.nextLine();
            try
            {
                number1 = Integer.parseInt(input1);
                isValidInput = true;
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Ошибка! Вы ввели некорректное значение. Попробуйте снова. Введите целое число!");

            }
        }
        isValidInput = false;
        while (!isValidInput)
        {
            System.out.print("Введите второе целое число: ");
            String input2 = scanner.nextLine();


            try
            {
                number2 = Integer.parseInt(input2);
                isValidInput = true;
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Ошибка! Вы ввели некорректное значение. Попробуйте снова. Введите целое число!");
                isValidInput = false;

            }
        }
        int result = number1 + number2;
        System.out.println("Сумма чисел: " + result);




    }
}