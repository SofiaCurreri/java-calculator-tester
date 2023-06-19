package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        float num1 = 10.5f;
        float num2 = 2.5f;
        calculator = new Calculator(num1, num2);
    }

    @Test
    void add() {
        float num1 = 10.5f;
        float num2 = 2.5f;
        float expectedResult = 13.0f;

        float result = calculator.add(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void subtract() {
        float num1 = 10.5f;
        float num2 = 2.5f;
        float expectedResult = 8.0f;

        float result = calculator.subtract(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void divide() {
        float num1 = 10.5f;
        float num2 = 2.5f;
        float expectedResult = 4.2f;

        float result = calculator.divide(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void multiply() {
        float num1 = 10.5f;
        float num2 = 2.5f;
        float expectedResult = 26.25f;

        float result = calculator.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }
}