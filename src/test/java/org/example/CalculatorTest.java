package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        calc = new Calculator();
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }


    @org.junit.jupiter.api.Test
    void monthlyPayment() {
        int creditAmount = 300_000;
        int month = 18;
        double percent = 15.0;
        double expected = 18715.0;
        double result = calc.monthlyPayment(creditAmount,month,percent);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void totalAmount() {
        int creditAmount = 300_000;
        int month = 18;
        double percent = 15.0;
        double expected = 336878.0;
        double result = calc.totalAmount(creditAmount,month,percent);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void totalOverpayment() {
        int creditAmount = 300_000;
        int month = 18;
        double percent = 15.0;
        double expected = 36878.0;
        double result = calc.totalOverpayment(creditAmount,month,percent);
        assertEquals(expected,result);
    }
}