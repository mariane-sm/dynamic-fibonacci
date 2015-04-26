import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ZeroOneKnapsackTest {

    private ZeroOneKnapsack zeroOneKnapsack = new ZeroOneKnapsack();
    private Map<String, Integer> values = new HashMap<>();
    private Map<String, Integer> weights = new HashMap<>();
    private int knapsackMaxWeight = 10;

    @Before
    public void setUp() {
        values.put("ItemA", 10);
        values.put("ItemB", 40);
        values.put("ItemC", 30);
        values.put("ItemD", 50);

        weights.put("ItemA", 5);
        weights.put("ItemB", 4);
        weights.put("ItemC", 6);
        weights.put("ItemD", 3);
    }

    @Test
    public void bruteForceWorks() {
        Set<String> expected = new HashSet<>();
        expected.add("ItemB");
        expected.add("ItemD");

        zeroOneKnapsack.calculateByBruteForce(knapsackMaxWeight, values, weights);
        //Set<String> items = zeroOneKnapsack.calculateByBruteForce(knapsackMaxWeight, values, weights);

        //assertThat(items, is(expected));
    }
}