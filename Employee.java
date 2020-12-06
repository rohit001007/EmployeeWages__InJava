package com.Bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Employee implements IComputeEmpWage {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private LinkedList<ComapnyEmpWage> comapnyEmpWageList;
    private Map<String, ComapnyEmpWage> companyToEmpWageMap;

    private Employee() {
        comapnyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addComapnyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        ComapnyEmpWage comapnyEmpWage = new ComapnyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursInMonth);
        comapnyEmpWageList.add(comapnyEmpWage);
        companyToEmpWageMap.put(company, comapnyEmpWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < comapnyEmpWageList.size(); i++) {
            ComapnyEmpWage comapnyEmpWage = comapnyEmpWageList.get(i);
            comapnyEmpWage.setTotalEmpWage(this.computeEmpWage(comapnyEmpWage));
            System.out.println(comapnyEmpWage);
        }
    }

    @Override
    public int getTotalWage(String comapny) {
        return companyToEmpWageMap.get(comapny).totalEmpWage;
    }

    public int computeEmpWage(ComapnyEmpWage comapnyEmpWage) {
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
        IComputeEmpWage empWage = new Employee();
        empWage.addComapnyEmpWage("Apple", 20, 20, 100);
        empWage.addComapnyEmpWage("Google", 30, 20, 80);
        empWage.addComapnyEmpWage("Microsoft", 30, 20, 80);
        empWage.computeEmpWage();
    }
}
