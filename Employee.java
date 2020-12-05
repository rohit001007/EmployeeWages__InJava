package com.Bridgelabz;

public class Employee {

    public static final int IsPartTime = 1;
    public static final int IsFullTime = 2;
    public static final int WagePerHr = 20;
    public static final int WorkingDays = 5;
    public static final int MaxHrsInMonth = 50;

    public static void main(String[] args) {
        int EmpHr = 0;
        int TotalEmpHr = 0;
        int TotalEmpWage = 0;
        int TotalWorkingDay =0;

        while (TotalEmpHr < MaxHrsInMonth && TotalWorkingDay <= WorkingDays) {
            TotalWorkingDay++;
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
            TotalEmpHr += EmpHr;
            System.out.println("\n Day#: "+TotalWorkingDay+" Employee Woks :"+EmpHr+"Hrs");
        }
        TotalEmpWage = TotalEmpHr*WagePerHr;
        System.out.println("\n * The Total Wage Of Employee Is :" + TotalEmpWage);
    }
}

