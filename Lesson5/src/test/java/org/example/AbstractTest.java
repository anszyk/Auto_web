package org.example;

import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractTest {
    protected static int a;
    protected static int b;
    protected static int c;
    protected static int area;

    @BeforeAll
    protected static void triangle() {

        area = triangleArea(8, 6, 4);
//        System.out.println("A triangle has an area of:" + area + "\n");

    }
    public static int triangleArea( int a, int b, int c )
    {
        int p = (int) ((a + b + c) / 2.0);
        area = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public static int getArea() {
        return area;
    }

    public static int getA(int a) {
        return a;
    }

    public static int getB(int b) {
        return b;
    }

    public static int getC(int c) {
        return c;
    }
}

