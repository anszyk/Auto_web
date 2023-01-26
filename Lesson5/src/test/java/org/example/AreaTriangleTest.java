package org.example;

import org.junit.jupiter.api.*;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AreaTriangleTest extends AbstractTest {

    private static Logger logger = LoggerFactory.getLogger(AreaTriangleTest.class);

    @BeforeAll
    static void beforeAll() {
        logger.info(Str1);
    }

    @BeforeEach
    void beforeEach() {
            logger.warn(Str2);
    }
    @Test
    @DisplayName("Позитивный тест. Сумма не больше третьей стороны")
    void oneTriangleCheckTest() {
        int q = getA() + getB();
        int w = getA() + getC();
        int e = getB() + getC();
        Assertions.assertTrue(q > getC() & w > getB() & e > getA(), "Треугольник не существует");
    }

    @Test
    @DisplayName("Является ли треугольник прямоугольным. Тест по Теореме Пифагора")
    void twoTriangleCheckTest() {
        int a = getA();
        int b = getB();
        int c = getC();
        int b2 = 2;
        Assertions.assertTrue(Math.pow(a, b2) + Math.pow(b, b2) != Math.pow(c, b2), "Это прямоугольный треугольник");
    }
    @Test
    @DisplayName("Тест с отрицательными значениями сторон ")
    void threeTriangleCheckTest() {
        Assertions.assertFalse((getA() <= 0 || getB() <= 0 || getC() <= 0), "Одно из значений сторон отрицательное или ноль");
    }

    @Test
    @DisplayName("Проверка корректности работы формулы")
    void fourTriangleCheckTest() {
        Assertions.assertNotNull(triangle(), "Вычисляемые значения не могут быть NULL");
    }

    @Test
    @DisplayName("Проверка корректности результатов вычисления площади треугольника")
    void fiveTriangleCheckTest() {
        Assertions.assertEquals(11, triangle(), "Значение площади треугольника некорректное");;

    }
}
