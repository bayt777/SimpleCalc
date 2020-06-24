package calculator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    int valA;
    int valB;
    int result;

    public ParameterizedTest(int valA, int valB, int result) {
        this.valA = valA;
        this.valB = valB;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}:{0}+{1}={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {10, 21, 31},
                {6, 23, 29},
                {5, 34, 39},
                {78, 4, 82},
                {23, 2, 25}
        });
    }

    @Test
    public void addition() {
        Assertions.assertEquals(result, Calculator.addition(valA, valB), "Wrong calc");
    }
}