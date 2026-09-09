package com.lab.model;

/**
 * Класс-запрос для передачи массива чисел в сервисный слой.
 * Содержит массив чисел и их количество.
 * 
 * @author User
 * @version 1.0
 */
public class NumberRequest {
    
    /**
     * Массив целых чисел для обработки.
     */
    private int[] numbers;
    
    /**
     * Количество чисел в массиве.
     */
    private int count;

    /**
     * Конструктор для создания объекта запроса.
     * 
     * @param numbers массив целых чисел
     */
    public NumberRequest(int[] numbers) {
        this.numbers = numbers;
        this.count = numbers.length;
    }

    /**
     * Возвращает массив чисел.
     * 
     * @return массив целых чисел
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * Возвращает количество чисел в массиве.
     * 
     * @return количество чисел
     */
    public int getCount() {
        return count;
    }
}