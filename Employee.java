package com.Bridgelabz;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

class Employee implements InEmployeeWageOops {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    int daySalary;
    private int numOfCompany = 0;
    ArrayList<Integer> dailyWage=new ArrayList<Integer>();
    private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
    private HashMap<String,CompanyEmpWage> companyEmpWageMap;

    public Employee() {
        companyEmpWageArrayList = new ArrayList<>();
        companyEmpWageMap= new HashMap<>();
    }
    public void dailyWage(){
        dailyWage.add(daySalary);
    }
    public void addCompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHr, numberOfWorkingDays, maxHrPerMonth);
        companyEmpWageArrayList.add(companyEmpWage);
        companyEmpWageMap.put(company, companyEmpWage);
    }
    public void computeEmpWage() {
        for (int i=0; i<companyEmpWageArrayList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= companyEmpWage.maxHrPerMonth && totalWorkingDays < companyEmpWage.numberOfWorkingDays) {

            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int)empCheck) {
                case IS_FULL_TIME :
                    empHrs = 8;
                    break;
                case IS_PART_TIME :
                    empHrs = 4;
                    break;
                default :
                    empHrs = 0;

            }//switch
            int daySalary=empHrs*companyEmpWage.empRatePerHr;
            companyEmpWage.dailyWage.add(daySalary);
            totalEmpHrs += empHrs;
            System.out.println("\n TotalWorkingDays: "+totalWorkingDays+"/ Daily EmpHrs: "+empHrs+"/ TotalEmpHrs: "+totalEmpHrs);
        }//while
        System.out.println(companyEmpWage.dailyWage);
        return totalEmpHrs * companyEmpWage.empRatePerHr;


    }
    public int getTotalEmpWage(String company) {
        return companyEmpWageMap.get(company).totalEmpWage;
    }


    public static void main(String[] args) {
        Employee empWageBuilder = new Employee();
        empWageBuilder.addCompanyEmpWage("ICICI", 50, 2, 100);
        empWageBuilder.addCompanyEmpWage("DMart", 20, 4, 100);
        empWageBuilder.addCompanyEmpWage("Accenture", 20, 6, 100);
        empWageBuilder.addCompanyEmpWage("IBM", 100, 8, 100);
        empWageBuilder.addCompanyEmpWage("Google", 100, 10, 100);
        empWageBuilder.computeEmpWage();
        System.out.println("\n * Total Wage Of Queried Company Is : "+empWageBuilder.getTotalEmpWage("Accenture"));
    }
}