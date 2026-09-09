package com.lab.service.impl;

import com.lab.model.NumberResponse;
import com.lab.service.LabService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Реализация сервиса для работы с числами.
 * Предоставляет логику поиска счастливых чисел.
 * 
 * @author User
 * @version 1.0
 */
@Service
public class LabServiceImpl implements LabService {

    /**
     * Находит счастливые числа в переданном списке.
     * Критерий счастливого числа: сумма цифр равна 7.
     * 
     * @param numbers список целых чисел для проверки
     * @return объект ответа с сообщением и списком счастливых чисел
     */
    @Override
    public NumberResponse findLuckyNumbers(List<Integer> numbers) {
        List<Integer> luckyNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (isLucky(number)) {
                luckyNumbers.add(number);
            }
        }

        String message = luckyNumbers.isEmpty() 
            ? "Счастливых чисел не найдено (сумма цифр должна быть равна 7)."
            : "Найдены счастливые числа";

        return new NumberResponse(message, luckyNumbers);
    }

    /**
     * Проверяет, является ли число счастливым.
     * Критерий: сумма цифр числа равна 7.
     * 
     * @param number проверяемое число
     * @return true, если число счастливое, иначе false
     */
    private boolean isLucky(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum == 7;
    }
}