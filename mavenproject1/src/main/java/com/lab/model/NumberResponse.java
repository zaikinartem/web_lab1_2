package com.lab.model;

import java.util.List;

/**
 * Класс-ответ для передачи результата поиска счастливых чисел.
 * Содержит сообщение о результате и список найденных счастливых чисел.
 * 
 * @author User
 * @version 1.0
 */
public class NumberResponse {

    /**
     * Сообщение о результате выполнения операции.
     */
    private String message;
    
    /**
     * Список счастливых чисел.
     */
    private List<Integer> luckyNumbers;

    /**
     * Конструктор для создания объекта ответа.
     * 
     * @param message сообщение о результате
     * @param luckyNumbers список счастливых чисел
     */
    public NumberResponse(String message, List<Integer> luckyNumbers) {
        this.message = message;
        this.luckyNumbers = luckyNumbers;
    }

    /**
     * Возвращает сообщение о результате.
     * 
     * @return сообщение
     */
    public String getMessage() {
        return message;
    }

    /**
     * Возвращает список счастливых чисел.
     * 
     * @return список счастливых чисел
     */
    public List<Integer> getLuckyNumbers() {
        return luckyNumbers;
    }
}