package com.company;

public class equalline {
    public static void main(String[] args) {
        int x1=1, x2=2, y1=3, y2=4;
        int a1=5, a2=6, b1=7, b2=7;
        double line1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double line2 = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
        System.out.println(line1);
        System.out.println(line2);
        boolean L12 = line1 == (line2);
        System.out.println("Are they equal :" + L12);
        int abc = Double.compare(line2, line1);
        System.out.println(abc);
        if (abc == 1) {
            System.out.println("line1 is greater than line2");
        }
        else
            System.out.println("line2 is smaller than line1");
    }
}
