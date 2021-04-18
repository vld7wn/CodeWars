package MakeAFunctionThatDoesArithmetic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testBasic() {
        assertEquals("'add' should return the two numbers added together!", 3, ArithmeticFunction.arithmetic(1, 2, "add"));
        assertEquals("'subtract' should return a minus b!", 6, ArithmeticFunction.arithmetic(8, 2, "subtract"));
        assertEquals("'multiply' should return a multiplied by b!", 10, ArithmeticFunction.arithmetic(5, 2, "multiply"));
        assertEquals("'divide' should return a divided by b!", 4, ArithmeticFunction.arithmetic(8, 2, "divide"));
    }

    @Test
    public void testRandom() {
        String[] commands = new String[]{"add","subtract","multiply","divide"};
        for (int i = 0; i < 40; i++) {
            int a = randInt(0, 10);
            int b = randInt(1, 10);
            String op = commands[randInt(0,3)];
            assertEquals("It should work for random inputs too", solution(a,b,op), ArithmeticFunction.arithmetic(a,b,op));
        }
    }

    private static int randInt(int min, int max) {
        return (int)(min + Math.random() * ((max - min) + 1));
    }

    private static int solution(int a, int b, String operator) {
        if (operator.equals("add"))
            return a + b;
        if (operator.equals("subtract"))
            return a - b;
        if (operator.equals("multiply"))
            return a * b;
        return a / b;
    }
}