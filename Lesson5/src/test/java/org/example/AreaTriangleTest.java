package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AreaTriangleTest extends AbstractTest {

    @Test
    @DisplayName("Позитивный тест. Сумма не больше третьей стороны")
    public void positiveTriangleCheckTest() {
        Assertions.assertTrue((getA(8) > 0 || getB(6) > 0 || getC(4) > 0), "Одно из значений сторон отрицательное или ноль");
        if (getA(8) + getB(6) > getC(4) & getA(8) + getC(4) > getB(6) & getB(6) + getC(4) > getA(8))
            System.out.println("Треугольник существует");
    }

    @Test
    @DisplayName("Негативный тест по Теореме Пифагора")
//    @AfterAll
    public void OneNegativeTriangleCheckTest() throws MyException {

        Assertions.assertTrue((getA(0) > 0), "'А' отрицательное или ноль");
        Assertions.assertTrue((getB(6) > 0), "'B' отрицательное или ноль");
        Assertions.assertTrue((getC(4) > 0), "'C' отрицательное или ноль");

        int a = getA(0);
        int b = getB(6);
        int c = getC(4);
        int b2 = 2;
        assertTrue(Math.pow(a, b2) + Math.pow(b, b2) != Math.pow(c, b2));
        throw new MyException("Треугольник не задан");

    }
    @Test
    @DisplayName("Негативный тест с отрицательными значениями сторон ")
//    @BeforeAll
    public void TwoNegativeTriangleCheckTest() throws MyException {

        Assertions.assertTrue((getA(8) > 0), "'А' отрицательное или ноль");
        Assertions.assertTrue((getB(0) > 0), "'B' отрицательное или ноль");
        Assertions.assertTrue((getC(4) > 0), "'C' отрицательное или ноль");

        int a = getA(8);
        int b = getB(0);
        int c = getC(4);

        if(a <= 0 || b <= 0 || c <= 0) throw new MyException("Проверка не прошла");

    }

}
