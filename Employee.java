package com.Bridgelabz;

public class Employee {

    public static void main(String[] args) {

        int FullTime=1;
        int PartTime=2;
        int WagePerHr=20;
        int WorkPerDay=8;
        int WorkPartTime=4;

        double empCheck=Math.floor((Math.random()*10)%3);

        if (FullTime==empCheck) {
            int WagePerDay = (WagePerHr * WorkPerDay);
            System.out.println("\n * The Full Day Wage Of Employee Is : " + WagePerDay);
        }
        else if (PartTime==empCheck) {
            int WagePartTime = (WagePerHr * WorkPartTime);
            System.out.println("\n * The Part Time Wage Of Employee Is : " + WagePartTime);
        }
        else
            System.out.println("\n * Employee Is Absent....!!");
    }
}
