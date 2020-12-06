package com.Bridgelabz;

public interface IComputeEmpWage {

    public void addComapnyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
