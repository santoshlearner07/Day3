package com.company;

public class empwageperhr {
    public static void main(String[] args) {
        int parttime = 1;
        int fulltime = 2;
        int emprateperhr = 20;
        int emphrs = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == fulltime)
            emphrs = 8;
        else if (empCheck == parttime)
            emphrs = 4;
            empwage = emphrs * emprateperhr;
            System.out.println("Empwage : " + empwage);
    }
}


