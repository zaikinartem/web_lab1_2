package com.lab.service;

import com.lab.model.NumberResponse;
import java.util.List;

/**
 * Интерфейс сервиса для работы с числами.
 * Определяет методы для поиска счастливых чисел.
 * 
 * @author User
 * @version 1.0
 */
public interface LabService {
    NumberResponse findLuckyNumbers(List<Integer> numbers);
}