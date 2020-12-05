package com.Bridgelabz;

public class Employee {

    public static void main(String[] args) {
        int FullTime=1;
        int WagePerHr=20;
        int WorkPerDay=8;

        double empCheck=Math.floor((Math.random()*10)%2);
        if (FullTime==empCheck){
            System.out.println("\n * Employee Is Present.");
            int WagePerDay=( WagePerHr*WorkPerDay);
            System.out.println(" * The Daily Wage Of Employee Is : "+WagePerDay);
        }
        else
            System.out.println("\n * Employee Is Absent....!!");
    }
}
