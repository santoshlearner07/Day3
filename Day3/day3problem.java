package com.company;

import java.util.Scanner;

public class day3problem {
    public static void main(String[] args) {
//        int x1 = 1, x2 = 7, y1 = 2, y2 = 7;
//        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//        System.out.println(distance);
//    }
//}
        int x1, x2, y1, y2;
        double dist;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1");
        x1 = sc.nextInt();
        System.out.println("Enter y1");
        y1 = sc.nextInt();
        System.out.println("Enter x2");
        x2 = sc.nextInt();
        System.out.println("Enter y2");
        y2 = sc.nextInt();
        dist = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println(dist);

    }
}