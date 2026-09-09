/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.model;

/**
 *
 * @author User
 */
public class NumberRequest {
    private int[] numbers;
    private int count;

    public NumberRequest(int[] numbers) {
        this.numbers = numbers;
        this.count = numbers.length;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getCount() {
        return count;
    }
}