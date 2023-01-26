import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class AreaTriangleTest extends  AbstractTest{

    @Test
    public void positiveTriangleCheckTest() {

        if (getA(8) + getB(6) > getC(4) & getA(8) + getC(4) > getB(6) & getB(6) + getC(4) > getA(8))
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");
    }

    @Test
//    @AfterAll
    public void OneNegativeTriangleCheckTest() throws MyException {

        int a = getA(0);
        int b = getB(6);
        int c = getC(4);
        int b2 = 2;
        assertTrue(Math.pow(a, b2) + Math.pow(b, b2) != Math.pow(c, b2));
            throw new MyException("Треугольник не задан");

    }
    @Test
//    @BeforeAll
    public void TwoNegativeTriangleCheckTest() throws MyException {

        int a = getA(0);
        int b = getB(6);
        int c = getC(4);

        if(a <= 0 || b <= 0 || c <= 0) throw new MyException("Проверка не прошла");

    }

}
