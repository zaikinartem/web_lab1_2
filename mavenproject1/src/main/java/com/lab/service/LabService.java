package com.lab.service;

import com.lab.model.NumberResponse;

import java.util.List;

public interface LabService {

    NumberResponse findLuckyNumbers(List<Integer> numbers);
}
