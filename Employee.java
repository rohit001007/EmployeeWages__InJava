package com.Bridgelabz;

public class Employee {

    public static void main(String[] args) {
        int FullTime=1;
        double empCheck=Math.floor((Math.random()*10)%2);
        if (FullTime==empCheck){
            System.out.println("\n * Employee Is Present...!");
        }
        else
            System.out.println("\n * Employee Is Absent...!");

    }
}
