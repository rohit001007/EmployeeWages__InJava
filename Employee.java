package com.Bridgelabz;

public class Employee {
    public static final int IsPartTime = 1;
    public static final int IsFullTime = 2;

    public static void CalculateWage(String a,int WagePerHr,int WorkingDays,int MaxHrsInMonth){
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
        System.out.println("\n --> For Company "+ a + " The Total Wage Of Employee Is :" + TotalEmpWage);
    }
    public static void main(String[] args){
        CalculateWage("Apple",30,5,10);
        CalculateWage("Google",50,3,10);
        CalculateWage("Microsoft",25,5,10);
        CalculateWage("Orale",15,10,50);
    }
}
