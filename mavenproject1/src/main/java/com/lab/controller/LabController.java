package com.lab.controller;

import com.lab.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Controller
public class LabController {

    @Autowired
    private LabService labService;

    public void executeLab2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Задание №2: Счастливые числа =====");

        System.out.print("Сколько чисел вы хотите ввести? ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        List<Integer> luckyNumbers = labService.findLuckyNumbers(numbers);

        System.out.println("\nРезультат:");
        if (luckyNumbers.isEmpty()) {
            System.out.println("Счастливых чисел не найдено (сумма цифр = 7).");
        } else {
            System.out.println("Счастливые числа: " + luckyNumbers);
        }

        scanner.close();
    }
}