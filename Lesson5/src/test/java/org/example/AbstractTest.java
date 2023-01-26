package org.example;

import org.junit.jupiter.api.BeforeAll;

import java.util.function.Supplier;

public abstract class AbstractTest {
    protected static int a = 8;
    protected static int b = 6;
    protected static int c = 4;
    protected static Supplier<String> Str1
            = () -> new String("Первый тест \n");

    protected static Supplier<String> Str2
            = () -> new String("Следующий тест \n");
    public int triangle() {

        int p = (int) ((a + b + c) / 2.0);
        int area = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
     int getA() {
        return a;
    }
     int getB() {
        return b;
    }

     int getC() {
        return c;
    }
}

