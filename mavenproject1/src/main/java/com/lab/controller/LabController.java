package com.lab.controller;

import com.lab.model.NumberResponse;
import com.lab.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        System.out.println("\n=== ЗАДАНИЕ 2 ===");
        System.out.println("Критерий счастливого числа: сумма цифр равна 7");

        int n = readInt("Введите количество чисел n: ");

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введите " + n + " целых чисел через пробел: ");
        for (int i = 0; i < n; i++) {
            numbers.add(readInt("Число " + (i + 1) + ": "));
        }

        NumberResponse response = labService.findLuckyNumbers(numbers);

        System.out.println("\nРезультат:");
        System.out.println(response.getMessage());
        if (!response.getLuckyNumbers().isEmpty()) {
            System.out.println("Счастливые числа: " + response.getLuckyNumbers());
        }

        scanner.close();
    }
/**
 * Считывает целое число с консоли с защитой от некорректного ввода.
 * Если пользователь вводит не целое число (буквы, символы и т.п.),
 * метод выводит сообщение об ошибке и повторяет запрос до тех пор,
 * пока не будет введено корректное целое число.
 *
 * @param prompt текст-приглашение, выводимый перед вводом
 * @return value
 */
    private int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите целое число!");
                scanner.nextLine();
            }
        }
    }
}
