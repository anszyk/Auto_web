import org.example.AreaTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class AssertAssumTest {

  /*  public static int b2 = 2;

    public AssertAssumTest(int a, int b, int c) {
        super(a, b, c);
    }

    @Test
    void getAll(){

        Assertions.assertAll(
                () -> assertTrue(a + b > c, "Треугольник существует"),
                () -> assertTrue(a + c > b, "Треугольник существует"),
                () -> assertTrue(b + c > a, "Треугольник существует")
        );
    }*/


    @Test
    void groupAssertions() {
        int[]numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1)
        );
    }



    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, ()
                -> {
            throw new UnsupportedOperationException("Not supported");
        });
        assertEquals(exception.getMessage(), "Not supported");
    }

}
