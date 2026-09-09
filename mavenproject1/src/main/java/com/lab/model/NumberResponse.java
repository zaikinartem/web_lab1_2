/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab.model;

/**
 *
 * @author User
 */
public class NumberResponse {
    private String result;
    private String operationType;
    
    public NumberResponse(String result, String operationType) {
    this.result = result;
    this.operationType = operationType;
    }
    
    public String getResult() {
        return result;
    }
    public String getOperationType() {
        return operationType;
    }
    
    @Override 
    public String toString() {
        return operationType + ": " + result;
    }
}
