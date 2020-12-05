package com.Bridgelabz;

public class Employee {

    public static final int IsPartTime = 1;
    public static final int IsFullTime = 2;
    public static final int WagePerHr = 20;
    public static final int WorkingDays = 20;

    public static void main(String args[]) {
        int EmpHr = 0;
        int WagePerDay = 0;
        int TotalEmpWage = 0;

        for (int day = 1; day <= WorkingDays; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);

            switch (empCheck) {
                case IsPartTime:
                    EmpHr = 4;
                    break;
                case IsFullTime:
                    EmpHr = 8;
                    break;
                default:
                    EmpHr = 0;
                    break;
            }
            WagePerDay = (EmpHr * WagePerHr);
            TotalEmpWage += WagePerDay;
        }
        System.out.println("\n * The Monthly Wage Of Employee Is :" + TotalEmpWage);
    }
}

