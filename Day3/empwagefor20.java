package com.company;

public class empwagefor20 {
    public static final int parttime = 1;
    public static final int fulltime = 2;
    public static final int emprateperhr = 20;
    public static final int numworkingdays = 18;

    public static void main(String[] args) {
        int emphrs = 0;
        int empwage = 0;
        int totalempwage = 0;
        for (int day = 0; day < numworkingdays; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case fulltime:
                    emphrs = 8;
                    break;
                case parttime:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }
            empwage = emphrs * emprateperhr;
            totalempwage += empwage;
            System.out.println("Empwage : " + empwage);
        }
        System.out.println("Total Empwage: " + totalempwage);
    }
}


