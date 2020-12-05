package com.Bridgelabz;

public class Employee {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfComapny = 0;
    private ComapnyEmpWage[] comapnyEmpWagesArray;

    private Employee() {
        comapnyEmpWagesArray = new ComapnyEmpWage[5];
    }

    private void addComapnyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        comapnyEmpWagesArray[numOfComapny] = new ComapnyEmpWage(company, empRatePerHour, numOfWorkingDays,
                maxHoursInMonth);
        numOfComapny++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfComapny; i++) {
            comapnyEmpWagesArray[i].setTotalEmpWage(this.computeEmpWage(comapnyEmpWagesArray[i]));
            System.out.println(comapnyEmpWagesArray[i]);
        }
    }

    private int computeEmpWage(ComapnyEmpWage comapnyEmpWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= comapnyEmpWage.maxHoursInMonth && totalWorkingDays < comapnyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("\n Day#: " + totalWorkingDays + " Employee Woks : " + empHrs);
        }
        return totalEmpHrs * comapnyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        Employee empWageArray = new Employee();
        empWageArray.addComapnyEmpWage("Apple", 20, 20, 100);
        empWageArray.addComapnyEmpWage("Google", 30, 20, 80);
        empWageArray.addComapnyEmpWage("Microsoft", 30, 20, 80);
        empWageArray.computeEmpWage();
    }
}
