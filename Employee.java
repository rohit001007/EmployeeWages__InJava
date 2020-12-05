package com.Bridgelabz;

public class Employee {

    public static void main(String[] args) {

        int WagePerHr = 20;
        int WorkPerDay = 8;
        int WorkPartTime = 4;

        int empCheck = (int) Math.floor((Math.random() * 10) % 3);

        switch (empCheck) {
            case 1:
                System.out.println("\n * Employee Is Full Time");
                int WagePerDay = (WagePerHr * WorkPerDay);
                System.out.println("\n * The Daily Wage Of Employee Is :" + WagePerDay);
                break;
            case 2:
                System.out.println("\n * Employee Is Part Time");
                int WagePartTime = (WagePerHr * WorkPartTime);
                System.out.println("\n * The Part Time Wage Of Employee Is :" + WagePartTime);
                break;
            default:
                System.out.println("\n * Employee Is Absent....!!");
        }
    }
}
