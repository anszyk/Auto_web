package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaTriangle {

    private static int a;
    private static int b;
    private static int c;

    public AreaTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();

        AreaTriangle areaTriangle = new AreaTriangle(a, b, c);

        System.out.println(" s = " + areaTriangle.areaOfATriangle());
    }

    public int areaOfATriangle() {

        double p = (a + b + c) * 1 / 2;
        int s = (int) sqrt(p * (p - a) * (p - b) * (p - c));
        return s;

    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
