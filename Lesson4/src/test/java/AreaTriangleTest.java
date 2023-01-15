import org.example.AreaTriangle;
import org.example.MyException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AreaTriangleTest {

    @Test
    public void positiveTriangleCheckTest() {
        AreaTriangle areaTriangle = new AreaTriangle(8, 6, 4);

        int a = areaTriangle.getA();
        int b = areaTriangle.getB();
        int c = areaTriangle.getC();

        if (a + b > c & a + c > b & b + c > a)
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");

    }

    @Test
    @AfterAll
    public static void TwoNegativeTriangleCheckTest() throws MyException {
        AreaTriangle areaTriangle = new AreaTriangle(0, 6, 4);

        int a = areaTriangle.getA();
        int b = areaTriangle.getB();
        int c = areaTriangle.getC();
        int b2 = 2;

        if (Math.pow(a, b2) + Math.pow(b, b2) != Math.pow(c, b2))
            throw new MyException("Треугольник не задан");


    }

    @Test
    @BeforeAll
    public static void OneNegativeTriangleCheckTest() throws MyException {
        AreaTriangle areaTriangle = new AreaTriangle(0, 6, 4);

        int a = areaTriangle.getA();
        int b = areaTriangle.getB();
        int c = areaTriangle.getC();

        if(a <= 0 || b <= 0 || c <= 0) throw new MyException("Проверка не прошла");

    }

}
