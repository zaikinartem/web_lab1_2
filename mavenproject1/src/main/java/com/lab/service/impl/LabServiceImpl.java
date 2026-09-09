package com.lab.service.impl;

import com.lab.model.NumberResponse;
import com.lab.service.LabService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LabServiceImpl implements LabService {

    private boolean isLucky(int number) {
        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum == 7;
    }

    @Override
    public NumberResponse findLuckyNumbers(List<Integer> numbers) {
        List<Integer> luckyNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (isLucky(num)) {
                luckyNumbers.add(num);
            }
        }

        String message;
        if (luckyNumbers.isEmpty()) {
            message = "Счастливых чисел не найдено (сумма цифр = 7)";
        } else {
            message = "Найдены счастливые числа!";
        }

        return new NumberResponse(message, luckyNumbers);
    }
}