import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Fibonacci sequence: 0 1 1 2 3 5 8 13 21 34 55 ...
 */
public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void calculateRecursivelyWorks() {
        assertEquals(0, fibonacci.calculateRecursively(0));
        assertEquals(1, fibonacci.calculateRecursively(1));
        assertEquals(1, fibonacci.calculateRecursively(2));
        assertEquals(2, fibonacci.calculateRecursively(3));
        assertEquals(3, fibonacci.calculateRecursively(4));
        assertEquals(5, fibonacci.calculateRecursively(5));
        assertEquals(8, fibonacci.calculateRecursively(6));
    }

    @Test
    public void calculateWithDynamicProgrammingWorks() {
        assertEquals(0, fibonacci.calculateWithDynamicProgramming(0));
        assertEquals(1, fibonacci.calculateWithDynamicProgramming(1));
        assertEquals(1, fibonacci.calculateWithDynamicProgramming(2));
        assertEquals(2, fibonacci.calculateWithDynamicProgramming(3));
        assertEquals(3, fibonacci.calculateWithDynamicProgramming(4));
        assertEquals(5, fibonacci.calculateWithDynamicProgramming(5));
        assertEquals(8, fibonacci.calculateWithDynamicProgramming(6));
    }
}