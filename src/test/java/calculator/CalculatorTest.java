package calculator;

import org.junit.jupiter.api.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("---------------------Start Test - " + testInfo.getDisplayName() + " ---------------------");
    }

    @AfterEach
    void tearDown() {
        System.out.println("---------------------Finish Test---------------------");
    }

    @Test()
    @DisplayName("addition")
    void addition() {
        Assertions.assertEquals(Calculator.addition(10, 12), 22, "Wrong result");
    }

    @Test
    @DisplayName("subtraction")
    void subtraction() {
        Assertions.assertEquals(calculator.subtraction(10, 12), -2, "Wrong result");
    }

    @Test
    @DisplayName("multiplication")
    void multiplication() {
        Assertions.assertEquals(calculator.multiplication(5, 5), 25, "Wrong result");
    }

    @Test
    @DisplayName("division")
    void division() {
        Assertions.assertEquals(calculator.division(15, 3), 5, "Wrong result");

    }
}