package com.company;

public class switchempwage {
    public static final int parttime = 1;
    public static final int fulltime = 2;
    public static final int emprateperhr = 20;

    public static void main(String[] args) {
        int emphrs = 0;
        int empwage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch ( empCheck ) {
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
        System.out.println("Empwage : " + empwage);
    }
}

