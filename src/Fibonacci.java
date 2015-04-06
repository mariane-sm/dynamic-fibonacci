import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public int calculateRecursively(int nth) {
        if (nth == 0 || nth == 1) return nth;
        return calculateRecursively(nth - 1) + calculateRecursively(nth - 2);
    }

    /**
     * There are two key attributes that a problem must have in order to apply dynamic programming:
     *  --> optimal substructure (divide and conquer)
     *  --> overlapping subproblems (store the solutions to the subproblems in a table, aka: memoization)
     */
    public int calculateWithDynamicProgramming(int nth) {
        Map<Integer, Integer> table = new HashMap<>();
        if (nth == 0 || nth == 1) return nth;

        if (table.containsKey(nth)) return table.get(nth);
        int value = calculateRecursively(nth - 1) + calculateRecursively(nth - 2);
        table.put(nth, value);
        return value;
    }
}
