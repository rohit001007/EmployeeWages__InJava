package com.Bridgelabz;

public class Employee{

    void empSalary() {

        int isFullTime = 1;
        int isPartTime = 0;
        int empRatePrHr = 20;
        int empHr = 0;
        int perDaySalary = 0;
        int mothWorkingDay = 20;
        int monthlySalary = 0;
        int monthyHrs = 0;

        for (int i = 1;i <= mothWorkingDay && monthyHrs <= 100;i++) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 2;

                switch ((int)empCheck) {

                    case 1 :
                        empHr = 8;
                        break;
                    case 0 :
                        empHr = 4;
                        break;
                }
                monthyHrs = monthyHrs + empHr;
                System.out.println("\n Day#: " + i + " Employee Working Hrs : " + monthyHrs);
                perDaySalary = empRatePrHr * empHr;
                System.out.println(perDaySalary);
                monthlySalary = perDaySalary + monthlySalary;
            }
            System.out.println("\n * The Monthly Employee Wage Is : "+monthlySalary);
        }
        public static void main(String[] args) {

            Employee empWage = new Employee();
            empWage.empSalary();
    }
}
