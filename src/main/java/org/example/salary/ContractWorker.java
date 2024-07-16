package org.example.salary;

public class ContractWorker implements CalcSalary {

    private double yearPay;

    public ContractWorker(double yearPay) {
        this.yearPay = yearPay;
    }

    @Override
    public double calcMonth() {
        return yearPay/12;
    }
}
