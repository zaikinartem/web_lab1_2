package com.lab.controller;

import com.lab.model.NumberResponse;
import com.lab.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Контроллер для управления выполнением лабораторной работы.
 * Обрабатывает ввод данных с консоли и взаимодействие с сервисным слоем.
 * 
 * @author User
 * @version 1.0
 */
@Controller
public class LabController {

    /**
     * Сервис для обработки чисел и поиска счастливых чисел.
     */
    @Autowired
    private LabService labService;

    /**
     * Сканер для чтения ввода с консоли.
     */
    private Scanner scanner;

    /**
     * Конструктор контроллера.
     * Инициализирует сканер для чтения ввода с консоли.
     */
    public LabController() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Выполняет задание лабораторной работы.
     * Запрашивает у пользователя массив чисел, вызывает сервис для поиска счастливых чисел
     * и выводит результат на консоль.
     */
    public void executeLab2() {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.out.println("\nЗАДАНИЕ 2");
        System.out.println("Критерий счастливого числа: сумма цифр равна 7");

        System.out.print("Введите количество чисел n: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.print("Введите " + n + " целых чисел через пробел: ");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        NumberResponse response = labService.findLuckyNumbers(numbers);
        
        System.out.println("\nРезультат:");
        System.out.println(response.getMessage());
        if (!response.getLuckyNumbers().isEmpty()) {
            System.out.println("Счастливые числа: " + response.getLuckyNumbers());
        }

        scanner.close();
    }
}