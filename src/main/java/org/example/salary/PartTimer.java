package org.example.salary;

public class PartTimer implements CalcSalary{

    private int hourPay;

    private int time;

    public PartTimer(int hourPay, int time) {
        this.hourPay = hourPay;
        this.time = time;
    }

    @Override
    public double calcMonth() {
        return hourPay * time;
    }
}
