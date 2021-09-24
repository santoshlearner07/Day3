package com.company;

public class empwagewhile100 {
    public static final int parttime = 1;
    public static final int fulltime = 2;
    public static final int emprateperhr = 20;
    public static final int numofworkingdays = 5;
    public static final int maxhrsinmonth = 20;

    public static void main(String[] args) {
        int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;
        while (totalemphrs <= maxhrsinmonth &&
        totalworkingdays < numofworkingdays) {
            totalworkingdays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case parttime:
                    emphrs = 4;
                    break;
                case fulltime:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
            }
            totalemphrs += emphrs;
            System.out.println("Day#: " + totalworkingdays + "emphr: " + emphrs);
        }
        int totalempwage = totalemphrs * emprateperhr;
        System.out.println("Total Emp Wage: " + totalempwage);
    }

}



