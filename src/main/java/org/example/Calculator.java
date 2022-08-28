package org.example;

public class Calculator {

    public static double logics(int creditAmount, int month, double percent) {
        double monthlyRate = percent / 12 / 100;
        double coefficient = (monthlyRate * (Math.pow((1 + monthlyRate), month))) / ((Math.pow((1 + monthlyRate), month)) -1);
        return coefficient * creditAmount;
    }
    public double monthlyPayment(int creditAmount, int month, double percent) {
        return Math.round(logics(creditAmount, month, percent));
    }

    public double totalAmount(int creditAmount, int month, double percent) {
        return Math.round(logics(creditAmount, month, percent) * month);
    }

    public double totalOverpayment(int creditAmount, int month, double percent) {
        return Math.round((logics(creditAmount, month, percent) * month) - creditAmount);
    }
}
